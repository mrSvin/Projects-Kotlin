class Wheel {
    var pressuare = 0.0

    fun upPressuare(upPressuare: Double) {
        pressuare = pressuare + upPressuare

        if (pressuare > 2.5 && pressuare<10) {
            throw TooHighPressure()
        }
        if (pressuare < 1.6 && pressuare>0) {
            throw TooLowPressure()
        }
        if (pressuare < 0 || pressuare>10) {
            throw IncorrectPressure()
        }
    }
}


