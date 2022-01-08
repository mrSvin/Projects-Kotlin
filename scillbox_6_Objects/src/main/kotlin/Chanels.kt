import java.util.*

//3,4,5 пункт
object Channels {
    var chanels  = listOf(
        "AAA",
        "BBB",
        "CCC",
        "DDD",
        "EEE",

    )


    fun getRandomChannels(): List<String> {

        chanels= chanels.shuffled() as MutableList<String>
//        println(chanels)
//
        return chanels
    }

//    fun getRandomString(length: Int) : String {
//        val allowedChars = ('A'..'Z')
//        return (1..length)
//            .map { allowedChars.random() }
//            .joinToString("")
//    }
}