fun main(args: Array<String>) {

    while (true) {
        println("Enter number")
        val n = readLine()?.toIntOrNull() ?: return
        if (n > 0) {
            fibonachi(n);
        } else {
            println("number must be >0")
        }
    }
}

fun fibonachi(input: Int): Int {
    var result = 0;
    var a = 0;
    var b = 1;
    if (input == 2) {
        result = 1;
        println("Result: " + result);
        return result
    }

    for (i in 3..input) {
        result = a + b
        a = b;
        b = result;

    }
    println("Result: " + result);
    return result
}



