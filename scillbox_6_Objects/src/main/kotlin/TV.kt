class TV {
    //1 пункт
    var brand = "rubin"
    var model = "1"
    var size = 15
    val on = true
    val off = false
    val listChanels = listOf("1.СТС", "2.ОРТ", "3.РТР", "4.РЕНТВ", "5.ДТВ")

    companion object {
        const val maxVolume = 32
    }

    //2 пункт
    var statusTV = false
    var volume = 0
    var chanel = 0

    fun tvOnOff(On: Boolean): Boolean {
        statusTV = On
        println(" статус ТВ включен: $statusTV")
        return statusTV
    }

    fun upVolume(value: Int): Int {
        if (volume + value < maxVolume) {
            volume = volume + value;
            println("Громкость увеличена! Текущая громкость: $volume")
        }

        return volume
    }

    fun downVolume(value: Int): Int {
        if (volume - value > 0) {
            volume = volume - value;
            println("Громкость уменьшена! Текущая громкость: $volume")
        }
        return volume
    }

    fun choiceChanel(value: Int): Int {
        if (statusTV == false) {
            tvOnOff(true)
            chanel = value
            println("Выбран канал: $chanel, статус ТВ включен: $statusTV")
        }

        return chanel
    }

    fun buttonUpChanel() {
        chanel++;
        if (statusTV == false) {
            tvOnOff(true)
        }
        if (chanel > listChanels.size) {
            chanel = 0;
        }
        println("Канал увеличен на 1! Выбран канал: $chanel")
    }

    fun buttonDownChanel() {
        chanel--;
        if (statusTV == false) {
            tvOnOff(true)
        }
        if (chanel < 0) {
            chanel = listChanels.size;
        }
        println("Канал уменьшен на 1! Выбран канал: $chanel")
    }

    //3,4,5 пункт
    object Channels {
        var chanels  = mutableListOf<String>()

        fun addChanel(nameChanel: String) {
            chanels.add(nameChanel)
        }

        fun getRandomChannels(): List<Any> {
               chanels= chanels.shuffled() as MutableList<String>
            println(chanels)
            return chanels
        }
    }

    //4 пункт



}

