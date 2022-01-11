class RubToUsd : CurrencyConverter {
    override val currencyCode: String
        get() = "840"

    override fun convertToRub(value: Int) {
        val result = value*75
        return println("${result} рублей, код валюты ${currencyCode}")
    }
}