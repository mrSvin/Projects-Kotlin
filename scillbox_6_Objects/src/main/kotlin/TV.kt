class TV(brand: String, model: String, size: Int) {
    //1 пункт
    var brand = brand
    var model = model
    var size = size
    val listChanels = Channels.getRandomChannels()

    companion object {
        const val maxVolume = 32
    }

    //2 пункт
    var statusTV = false
    var volume = 0
    var chanel = 0

    fun tvOnOff(On: Boolean) {
        statusTV = On
        println(" статус ТВ включен: $statusTV")
    }

    fun upVolume(value: Int) {
        if (volume + value < maxVolume) {
            volume = volume + value;
            println("Громкость увеличена! Текущая громкость: $volume")
        }
    }

    fun downVolume(value: Int) {
        if (volume - value > 0) {
            volume = volume - value;
            println("Громкость уменьшена! Текущая громкость: $volume")
        }
    }

    fun choiceChanel(value: Int) {
        if (statusTV == false) {
            tvOnOff(true)
            chanel = value
            println("Выбран канал: $chanel, статус ТВ включен: $statusTV")
        }

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





}

