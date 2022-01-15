import java.math.BigInteger

object Fibonacci {

    suspend fun take(input: Int) : BigInteger {
        var result = BigInteger.valueOf(0)
        var a = BigInteger.valueOf(0)
        var b = BigInteger.valueOf(1)
        if (input == 2) {
            result = BigInteger.valueOf(1)
            return result
        }

        for (i in 3..input) {
            result = a + b
            a = b
            b = result;

        }

        return result
    }

}


