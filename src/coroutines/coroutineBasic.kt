package coroutines

import kotlinx.coroutines.*

fun main() {

    //basic()
    //blockingMainThread()
    //nonBlocking()
    //concurrency()
    //scope()
    //extract()
    repeat()
}

fun basic() {
    GlobalScope.launch { // launch new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}

fun blockingMainThread() {
    GlobalScope.launch { // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main thread continues here immediately
    runBlocking {     // but this expression blocks the main thread
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}

//Waiting for a job
fun nonBlocking() = runBlocking {
    //sampleStart
    val job = GlobalScope.launch { // launch new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes sampleEnd
}

//Structured concurrency
fun concurrency() = runBlocking { // this: CoroutineScope
    launch { // launch new coroutine in the scope of runBlocking
        delay(2000L)
        println("World!")
    }
    println("Hello,")
}

//Scope builder
fun scope() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // Creates a new coroutine scope
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // This line will be printed before nested launch
    }

    println("Coroutine scope is over") // This line is not printed until nested launch completes
}

//Extract function refactoring
fun extract() = runBlocking {
    launch { doWorld() }
    println("Hello,")

}
// this is your first suspending function
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

//Global coroutines are like daemon threads
fun repeat() = runBlocking {
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // just quit after delay

    extract()
}
