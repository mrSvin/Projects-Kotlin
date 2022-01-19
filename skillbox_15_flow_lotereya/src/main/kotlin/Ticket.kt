import kotlinx.coroutines.cancel

class Ticket {

    //Заполняем в билете выпавшие значения
    fun markerTicket(bochonok: Int, ticket: MutableList<Int>, namePlayer: String): MutableList<Int> {
        for (i in 0..ticket.size - 1) {
            if (bochonok == ticket.get(i)) {
                ticket.set(i, 0)
                println("$namePlayer $ticket")
            }
        }
        return ticket
    }

    fun winPlayer(ticket: MutableList<Int>, namePlayer: String): Boolean {
        var countWinNumbers = 0
        for (i in 0..ticket.size - 1) {
            if (ticket.get(i) == 0) {
                countWinNumbers++
            }
        }
        if (countWinNumbers==15) {
            println("$namePlayer победил!")
            return true
        } else
            return false
    }

}