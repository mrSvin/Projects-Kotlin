open class DebitCard() : BankCard() {

    override fun put(putMoney: Int) {
       balance=balance+putMoney
        println("Пополнение дебетовой карты на ${putMoney}")
    }

    override fun pay(payMoney: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun info() {
        println("Баланс дебетовой карты ${balance}")
    }

    override fun infoAll() {
        TODO("Not yet implemented")
    }
}