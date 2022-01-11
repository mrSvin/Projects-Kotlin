class RubToEur : CurrencyConverter {
    override val currencyCode: String
        get() = "978"

    override fun convertToRub(value: Int) {
        val result = value*80
        return println("${result} рублей, код валюты ${currencyCode}")
    }
}