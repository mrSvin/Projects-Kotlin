import java.util.*

//3,4,5 пункт
object Channels {
    var chanels  = mutableListOf<String>()

    fun addChanel(nameChanel: String) {
        chanels.add(nameChanel)
    }

    fun getRandomChannels(): Map<Int,String> {
        val randomLengthChanels = 5+ Math.random()*10
        for (i in 1..randomLengthChanels.toInt()) {
            val nameChanel = getRandomString(5)
            addChanel("$nameChanel")
        }

        chanels= chanels.shuffled() as MutableList<String>
//        println(chanels)
        val mapChanels = mutableMapOf<Int, String>()
        for (i in 1..chanels.size-1) {
            mapChanels.put(i, chanels.get(i))
        }
        mapChanels.forEach { (key, value) ->
            println("$key. $value")
        }
        return mapChanels
    }

    fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}