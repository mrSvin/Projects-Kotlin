object Converters {
    fun get(currencyCode: String): String {
        var converter = ""

        val anonymous = object : CurrencyConverter {
            override val currencyCode: String
                get() = "0"
        }
        converter = anonymous.currencyCode

        if (currencyCode.equals("840")) {
            converter = RubToUsd().currencyCode
        }
        if (currencyCode.equals("978")) {
            converter = RubToEur().currencyCode
        }

        return converter
    }
}


