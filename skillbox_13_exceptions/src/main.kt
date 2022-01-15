fun main(args: Array<String>) {
    val wheel = Wheel()
    wheel.upPressuare(3.1)
//    wheel.upPressuare(1.1)
//    wheel.upPressuare(-1.1)
//    wheel.upPressuare(11.1)

}

class TooHighPressure : Throwable(message = "слишком высокое давление")
class TooLowPressure  : Throwable(message = "слишком низкое давление")
class IncorrectPressure  : Throwable(message = "недопустимое давление: отрицательное или превышающее 10 атмосфер")




