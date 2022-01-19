import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

//генерируем рандомное число и сравниваем нет ли его в массиве, после заполняем его в массив.

//Для одного наблюдателя за всеми игроками
// object GenericRandom {

//    val flow = flow {
//        while (currentCoroutineContext().isActive) {
//            repeatBochonok = false
//            val bochonok = Random.nextInt(1, 90)
//
//
//            if (oldValues.size > 0) {
//                for (i in 0..oldValues.size - 1) {
//                    if (oldValues.get(i) == bochonok) {
//                        repeatBochonok = true
//                    }
//                }
//            }
//            if (repeatBochonok == false) {
//                emit(bochonok)
//                oldValues.add(bochonok)
////                println(oldValues)
//                delay(100)
//            }
//        }
//    }
//}

object GeneratorShared {
    val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>()
    val stateFlow = _sharedFlow.asSharedFlow()

    init {
        scope.launch {

            while (winPlayer1 == false && winPlayer2 == false && winPlayer3 == false) {
                repeatBochonok = false
                val bochonok = Random.nextInt(1, 90)


                if (oldValues.size > 0) {
                    for (i in 0..oldValues.size - 1) {
                        if (oldValues.get(i) == bochonok) {
                            repeatBochonok = true
                        }
                    }
                }
                if (repeatBochonok == false) {
                    _sharedFlow.emit(bochonok)
                    oldValues.add(bochonok)
//                println(oldValues)
                    delay(10)
                }
            }
        }
    }
}


//    fun flow() : Flow<Int> {
//        return flow {
//            while (currentCoroutineContext().isActive) {
//                emit(Random.nextInt(1,90))
//                delay(1000)
//            }
//        }
//    }

