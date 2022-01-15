class RubToEur : CurrencyConverter {
    override val currencyCode: String
        get() = "978"

    override fun convertToRub(value: Int): Int {
        val result = value*80
        println("${result} рублей, код валюты ${currencyCode}")
        return result
    }
}
