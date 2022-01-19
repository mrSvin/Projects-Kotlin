import kotlin.random.Random

class NewPlayer {
    //Генерируем играющий билет c длиной массива 15 по возрастанию для удобства (каждая строка билета, 5 чисел массива)
    fun newTicket(): MutableList<Int> {
        var arrayTicket = mutableListOf<Int>();
        var numberForTicket = Random.nextInt(1, 7)
        arrayTicket.add(numberForTicket)
//        println(numberForTicket)
        for (i in 1..14) {
            numberForTicket = 6*i+ Random.nextInt(1, 7)
            arrayTicket.add(numberForTicket)
        }
        println("Взят билет с номерами: " + arrayTicket)
        return arrayTicket
    }
}