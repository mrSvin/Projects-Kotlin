import kotlinx.coroutines.*

var oldValues = mutableListOf<Int>()
var repeatBochonok = false

//Логика для одного наблюдателя ко всем игрокам
//fun main() {
//
//    //генерируем трех игроков
//    var player1 = NewPlayer().newTicket()
//    var player2 = NewPlayer().newTicket()
//    var player3 = NewPlayer().newTicket()
//
//
//    runBlocking {
//
//        launch {
//            GenericRandom.flow.collect {
//                if (repeatBochonok == false) {
//                    println("Вытащен боченок с номером - $it")
//
//                    //Заменяем нулями выпавшие значения в билетах
//                    player1 = Ticket().markerTicket(it, player1, "player1")
//                    player2 = Ticket().markerTicket(it, player2, "player2")
//                    player3 = Ticket().markerTicket(it, player3, "player3")
//
//                    //Проверяем на выигрыш билеты
//                    val winPlayer1 = Ticket().winPlayer(player1, "player1")
//                    val winPlayer2 = Ticket().winPlayer(player2, "player2")
//                    val winPlayer3 = Ticket().winPlayer(player3, "player3")
//
//                    //При выиграше одного из билетов останавливаем корутину
//                    if (winPlayer1 || winPlayer2 || winPlayer3) {
//                        cancel()
//                    }
//                }
//            }
//        }
//
//    }
//
//}

//Наблюдатель на каждом игроке
fun main() {
    GameLoto().loto()
}














