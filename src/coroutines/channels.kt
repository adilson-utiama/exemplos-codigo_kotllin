package coroutines

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    //channelbasic()
    closingChannel()
}

//Channel Basics
//A Channel is conceptually very similar to BlockingQueue.
//One key difference is that instead of a blocking put operation it has a suspending send,
// and instead of a blocking take operation it has a suspending receive.
fun channelbasic() = runBlocking {
    val channel = Channel<Int>()
    val channel2 = Channel<Int>()
    launch {
        // this might be heavy CPU-consuming computation or async logic, we'll just send five squares
        for (x in 1..5) {
            channel.send(x * x )
            channel2.send(x / x)
        }
    }
    // here we print five received integers:
    repeat(5) {
        println(channel.receive())
        println(channel2.receive())
    }
    println("Done!")
}

//Closing and iteration over channels
fun closingChannel() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close() // we're done sending
        for (x in 1..5) channel.send(x + x) //not sending to channel
    }
// here we print received values using `for` loop (until the channel is closed)
    for (y in channel) println(y)
    println("Done!")
}