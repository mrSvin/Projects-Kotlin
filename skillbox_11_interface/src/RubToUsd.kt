class RubToUsd : CurrencyConverter {
    override val currencyCode: String
        get() = "840"

    override fun convertToRub(value: Int): Int {
        val result = value*75
        println("${result} рублей, код валюты ${currencyCode}")
        return result
    }
}


