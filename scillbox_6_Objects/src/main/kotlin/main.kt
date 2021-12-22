val contactList = mutableListOf<String>()

fun main(args: Array<String>) {
    //5
    TV.Channels.addChanel("1.СТС")
    TV.Channels.addChanel("2.РЕНТВ")
    TV.Channels.addChanel("3.НТВ")
    TV.Channels.addChanel("4.РТР")
    TV.Channels.addChanel("5.ОРТ")
    TV.Channels.getRandomChannels()

    //6
    //Создаем ТВ Самсунг
    val tv1 = TV()
    tv1.brand="Samsung"
    tv1.model="6112"
    tv1.size=42
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
    val tv2 = TV()
    tv2.brand="LG"
    tv2.model="234"
    tv2.size=55
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




