package coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) {

    //context()
    //teste()
    //jobInContext()
    //childrenOfCoroutine()
    //parental()
    //namingCoroutines()
    combiningContext()

}

//Dispatchers and threads
//Coroutine context includes a coroutine dispatcher (see CoroutineDispatcher) that determines
//what thread or threads the corresponding coroutine uses for its execution.
//Coroutine dispatcher can confine coroutine execution to a specific thread,
//dispatch it to a thread pool, or let it run unconfined.
//
//All coroutine builders like launch and async accept an optional CoroutineContext parameter
//that can be used to explicitly specify the dispatcher for new coroutine and other context elements.
fun context() = runBlocking {
    launch { // context of the parent, main runBlocking coroutine
        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
        println("Default               : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(newSingleThreadContext("MyOwnThread")) { // will get its own new thread
        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
    }
}

//Unconfined vs confined dispatcher
fun teste() = runBlocking {
    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
        println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
        delay(500)
        println("Unconfined      : After delay in thread ${Thread.currentThread().name}")
    }
    launch { // context of the parent, main runBlocking coroutine
        println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
        delay(1000)
        println("main runBlocking: After delay in thread ${Thread.currentThread().name}")
    }

    //print
    //Unconfined      : I'm working in thread main
    //main runBlocking: I'm working in thread main
    //Unconfined      : After delay in thread kotlinx.coroutines.DefaultExecutor
    //main runBlocking: After delay in thread main
}

//Job in the context
fun jobInContext() = runBlocking {
    println("My job is ${coroutineContext[Job]}")
}


//Children of a coroutine
fun childrenOfCoroutine() = runBlocking {
    // launch a coroutine to process some kind of incoming request
    val request = launch {
        // it spawns two other jobs, one with GlobalScope
        GlobalScope.launch {
            println("job1: I run in GlobalScope and execute independently!")
            delay(1000)
            println("job1: I am not affected by cancellation of the request")
        }
        // and the other inherits the parent context
        launch {
            delay(100)
            println("job2: I am a child of the request coroutine")
            delay(1000)
            println("job2: I will not execute this line if my parent request is cancelled")
        }
    }
    delay(500)
    request.cancel() // cancel processing of the request
    delay(1000) // delay a second to see what happens
    println("main: Who has survived request cancellation?")
}

//Parental responsibilities
fun parental() = runBlocking {
    // launch a coroutine to process some kind of incoming request
    val request = launch {
        repeat(3) { i -> // launch a few children jobs
            launch  {
                delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
                println("Coroutine $i is done")
            }
        }
        println("request: I'm done and I don't explicitly join my children that are still active")
    }
    request.join() // wait for completion of the request, including all its children
    println("Now processing of the request is complete")
}

//Naming coroutines for debugging
fun namingCoroutines() = runBlocking {
    println("Started main coroutine")
    // run two background value computations
    val v1 = async(CoroutineName("v1coroutine")) {
        delay(500)
        println("Computing v1")
        252
    }
    val v2 = async(CoroutineName("v2coroutine")) {
        delay(1000)
        println("Computing v2")
        6
    }
    println("The answer for v1 / v2 = ${v1.await() / v2.await()}")
}

//Combining context elements
fun combiningContext() = runBlocking {
    launch(Dispatchers.Default + CoroutineName("test")) {
        println("I'm working in thread ${Thread.currentThread().name}")
    }
}

