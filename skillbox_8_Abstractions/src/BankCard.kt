abstract class BankCard {
    var balance = 0
    private var limitCredit = 0

    abstract fun put(putMoney: Int)
    abstract fun pay(payMoney: Int): Boolean
    abstract fun info()
    abstract fun infoAll()

    fun putMoney(putMoney: Int) {
        balance=balance+putMoney
        println("Пополнение карты на ${putMoney}")
    }
    fun payMoney(payMoney: Int): Boolean {
        balance=balance-payMoney
        return true
    }

    fun infoMoney() {
    println(balance)
    }

    fun infoAllMoney() {
        return println("${balance} ${limitCredit}")
    }

}