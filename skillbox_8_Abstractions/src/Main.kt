fun main(args: Array<String>) {
    val cardCredit = CreditCard()
    cardCredit.info()
    cardCredit.put(10000)
    cardCredit.info()
    cardCredit.pay(12000)
    cardCredit.info()
    cardCredit.pay(9000)    // Проверка на превышение лимита
    cardCredit.pay(8000)
    cardCredit.info()
    println()

    val debitCard = DebitCard()
    debitCard.info()
    debitCard.put(3000)
    debitCard.info()
    println()

    val cardCredit2 = CreditCardDerivative()
    cardCredit2.info()
    cardCredit2.put(10000)
    cardCredit2.info()
    cardCredit2.pay(12000)
    cardCredit2.info()
    cardCredit2.pay(9000)    // Проверка на превышение лимита
    cardCredit2.pay(8000)
    cardCredit2.info()
    println()

    val debitCard2 = DebitCardDerivative()
    debitCard2.info()
    debitCard2.put(3000)
    debitCard2.info()

}