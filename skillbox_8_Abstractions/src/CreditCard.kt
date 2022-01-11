open class CreditCard() : BankCard() {

    var limitCredit = 10000
    var credit = 0 // Считаем его в отрицательной сумме

    override fun put(putMoney: Int) {
        if (credit < 0) {
            credit = credit + putMoney
            if (credit > 0) {
                balance = balance + credit
                credit = 0
            }
        } else {
            balance = balance + putMoney
        }
        println("Пополнение кредитной карты на ${putMoney}")
    }

    override fun pay(payMoney: Int): Boolean {
        val maxNowPay = limitCredit + balance + credit
        if (payMoney > maxNowPay) {
            println("Недостаточно средств для совершения покупки")
            return false
        } else {
            if (balance > 0) {
                balance = balance - payMoney
                if (balance < 0) {
                    credit = balance
                    balance = 0
                }
            } else {
                credit = credit - payMoney
            }


            println("Оплата кредитной картой ${payMoney}")
            return true
        }
    }

    override fun info() {
        println("Кредитная карта с лимитом ${limitCredit}")
        println("Собственные средства ${balance}")
        println("Кредитные средства ${credit}")
    }

    override fun infoAll() {
        TODO("Not yet implemented")
    }
}