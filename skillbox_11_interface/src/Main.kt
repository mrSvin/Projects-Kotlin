fun main(args: Array<String>) {

    println(Converters.get("840"))
    println(Converters.get("978"))
    println(Converters.get("234"))  //Неизвестная валюта
    RubToUsd().convertToRub(10)
    RubToEur().convertToRub(8)
}