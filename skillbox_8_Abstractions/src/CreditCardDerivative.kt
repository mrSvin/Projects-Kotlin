import kotlin.math.roundToInt

class CreditCardDerivative() : CreditCard() {


    private val bonusCashBack = 0.005

    override fun pay(payMoney: Int): Boolean {
        val maxNowPay = limitCredit + balance + credit
        if (payMoney > maxNowPay) {
            println("Недостаточно средств для совершения покупки")
            return false
        } else {
            val cashback = (payMoney * bonusCashBack).roundToInt()
            if (balance > 0) {
                balance = balance - payMoney + cashback
                if (balance < 0) {
                    credit = balance
                    balance = 0
                }
            } else {
                credit = credit - payMoney + cashback
            }

            println("Оплата кредитной картой ${payMoney}, кэшбек ${cashback}")
            return true
        }
    }



}