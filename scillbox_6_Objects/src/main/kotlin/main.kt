val contactList = mutableListOf<String>()

fun main(args: Array<String>) {
    //5

    //6
    //Создаем ТВ Самсунг
    val tv1 = TV("Samsung", "6112", 42)
//    print(tv1.chanel)
    print(tv1.brand + " " + tv1.model + " " + tv1.size)
    tv1.tvOnOff(true)
    tv1.tvOnOff(false)
    tv1.upVolume(6)
    tv1.upVolume(9)
    tv1.downVolume(5)
    tv1.downVolume(4)
    tv1.choiceChanel(4)
    tv1.buttonUpChanel()
    tv1.buttonDownChanel()
    println("")
    for (i in 1..3) {
        tv1.buttonUpChanel()
    }
    for (i in 1..3) {
        tv1.buttonDownChanel()
    }
    println("")
    for (i in 1..3) {
        tv1.upVolume(2)
    }
    for (i in 1..3) {
        tv1.downVolume(3)
    }

    //Создаем ТВ Самсунг
    val tv2 = TV("LG","234",55)
    print(tv2.brand + " " + tv2.model + " " + tv2.size)
    tv2.tvOnOff(true)
    tv2.tvOnOff(false)
    tv2.upVolume(6)
    tv2.upVolume(9)
    tv2.downVolume(5)
    tv2.downVolume(4)
    tv2.choiceChanel(4)
    tv2.buttonUpChanel()
    tv2.buttonDownChanel()
    println("")
    for (i in 1..3) {
        tv2.buttonUpChanel()
    }
    for (i in 1..3) {
        tv2.buttonDownChanel()
    }
    println("")
    for (i in 1..3) {
        tv2.upVolume(2)
    }
    for (i in 1..3) {
        tv2.downVolume(3)
    }

}




