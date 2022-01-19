import kotlinx.coroutines.*
import java.math.BigInteger

var longSolution = false;

fun main() {
//    test()    // 1-9 пункты
    asterisk()  // задание со зведочкой
}

fun test() = runBlocking {
    println("START!")
    launch {
        try {
            withTimeout(5000) {
                println("Solution 1:" + Fibonacci.take(3000))
            }
        } catch (e: TimeoutCancellationException) {
            println("Превышено время вычеслений")
        }
    }
    launch {
        println("Solution 2:" + Fibonacci.take(2000))
        longSolution = true
    }
    launch {
        println("Solution 3:" + Fibonacci.take(5))
    }
    launch {
        while (longSolution == false) {
            delay(1)
            print(".")
        }
    }

}

val parentJob = Job()
val parentJob2 = Job()

fun asterisk() = runBlocking {
    println("START!")

    launch {
        println("Solution 1:" + Fibonacci.take(2000))
        parentJob.complete()
        longSolution = true
    }
    launch {
        parentJob.join()
        println("Solution 2:" + Fibonacci.take(5))

    }
    launch {
        while (longSolution == false) {
            delay(1)
            print(".")
        }
    }

}





