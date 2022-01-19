import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var winPlayer1 = false
var winPlayer2 = false
var winPlayer3 = false

class GameLoto {

    fun loto() {
        //генерируем трех игроков
        var player1 = NewPlayer().newTicket()
        var player2 = NewPlayer().newTicket()
        var player3 = NewPlayer().newTicket()


        runBlocking {


            val job1 = launch {

                GeneratorShared.stateFlow
                    .takeWhile { winPlayer1 == false && winPlayer2 == false && winPlayer3 == false }
                    .collect {

                        if (repeatBochonok == false) {
                            println("1 игрок увидел боченок с номером - $it")

                            //Заменяем нулями выпавшие значения в билетах
                            player1 = Ticket().markerTicket(it, player1, "player1")
                            //Проверяем на выигрыш билеты
                            winPlayer1 = Ticket().winPlayer(player1, "player1")
                        }
                        if (winPlayer1 || winPlayer2 || winPlayer3 ) {
                            cancel()

                        }
                    }

            }

            val job2 =launch {
                GeneratorShared.stateFlow
                    .takeWhile { winPlayer1 == false && winPlayer2 == false && winPlayer3 == false }
                    .collect {

                        if (repeatBochonok == false) {
                            println("2 игрок увидел боченок с номером - $it")

                            //Заменяем нулями выпавшие значения в билетах
                            player2 = Ticket().markerTicket(it, player2, "player2")
                            //Проверяем на выигрыш билеты
                            winPlayer2 = Ticket().winPlayer(player2, "player2")
                        }

                        if (winPlayer1 || winPlayer2 || winPlayer3 ) {
                            job1.cancel()
                            cancel()
                        }
                    }
            }

            launch {
                GeneratorShared.stateFlow
                    .takeWhile { winPlayer1 == false && winPlayer2 == false && winPlayer3 == false }
                    .collect {
                        //При выиграше одного из билетов останавливаем корутину
//                if (winPlayer1 || winPlayer2 || winPlayer3) {
//                    println("3!!!!!!!!!!")
//                    GeneratorShared.scope.cancel()
//                    cancel()
//                }
                        if (repeatBochonok == false) {
                            println("3 игрок увидел боченок с номером - $it")

                            //Заменяем нулями выпавшие значения в билетах
                            player3 = Ticket().markerTicket(it, player3, "player3")
                            //Проверяем на выигрыш билеты
                            winPlayer3 = Ticket().winPlayer(player3, "player3")
                        }

                        if (winPlayer1 || winPlayer2 || winPlayer3 ) {
                            job1.cancel()
                            job2.cancel()
                            cancel()
                        }

                    }
            }
        }

    }

}