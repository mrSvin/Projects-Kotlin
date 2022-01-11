import kotlin.math.roundToInt

class DebitCardDerivative() : DebitCard() {
    val bonusCashDebit = 0.001
    override fun put(putMoney: Int) {
        balance= balance+putMoney+(putMoney*bonusCashDebit).roundToInt()
    }
}