object Converters {
    fun get(currencyCode: String): String {
        var currentCode = ""

        val anonymous = object : CurrencyConverter {
            override val currencyCode: String
                get() = "000"
        }
        currentCode = anonymous.currencyCode

        if (currencyCode.equals("840")) {
            currentCode = RubToUsd().currencyCode
        }
        if (currencyCode.equals("978")) {
            currentCode = RubToEur().currencyCode
        }


        return currentCode
    }
}