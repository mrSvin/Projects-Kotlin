fun main(args: Array<String>) {
    val str = "F2p)v\"y233{0->c}ttelciFc"
    var strFirts = str.substring(0, str.length / 2)
    var strTwo = str.substring(str.length / 2, str.length)

    //Декодируем
    var temp1 = decoderFirst(strFirts);
    var temp2 = decoderTwo(strTwo);

    println("Result:");
    println("$temp1$temp2");
}

fun decoderFirst(input: String) :String {
    var decoder1 = shift(input, 1);
    decoder1 = decoder1.replace("5", "s");
    decoder1 = decoder1.replace("4", "u");
    decoder1 = shift(decoder1, -3);
    decoder1 = decoder1.replace("0", "o");
    //println(decoder1)
    return decoder1
}

fun decoderTwo(input: String) :String {
    var decoder2 = input.reversed();
    decoder2 = shift(decoder2, -4);
    decoder2 = decoder2.replace("_", " ");
    //println(decoder2)
    return decoder2
}


fun shift(input: String, lengthShift: Int): String {
    val shiftedString = input.map { char -> char + lengthShift }.joinToString("");
    //println(input);
    //println(shiftedString);
    return shiftedString;
}


