fun main(args: Array<String>) {

    val zapovednik = NatureReserve()
    for (i in 1..30) {
        zapovednik.randomAction()

        if (zapovednik.countAnimals<=0) {
            println("Все животные исчезли")
            System.exit(0)
        }

        zapovednik.pig.tryIncrementAge()
        zapovednik.horse.tryIncrementAge()

        zapovednik.chiken.tryIncrementAge()
        zapovednik.petuh.tryIncrementAge()
        zapovednik.Straus.tryIncrementAge()
        zapovednik.Crow.tryIncrementAge()
        zapovednik.Eagle.tryIncrementAge()

        zapovednik.Okun.tryIncrementAge()
        zapovednik.Karas.tryIncrementAge()
        zapovednik.Yaz.tryIncrementAge()

        zapovednik.Ovcharka.tryIncrementAge()
        zapovednik.Pudel.tryIncrementAge()

        if (zapovednik.pig.age>zapovednik.pig.maxAge) {
            zapovednik.countAnimals--
            println("У животного превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.horse.age>zapovednik.horse.maxAge) {
            zapovednik.countAnimals--
            println("У животного превышен максимальный возраст и оно удалилось с заповедника")
        }

        if (zapovednik.chiken.age>zapovednik.chiken.maxAge) {
            zapovednik.countAnimals--
            println("У птицы превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.petuh.age>zapovednik.petuh.maxAge) {
            zapovednik.countAnimals--
            println("У птицы превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.Straus.age>zapovednik.Straus.maxAge) {
            zapovednik.countAnimals--
            println("У птицы превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.Crow.age>zapovednik.Crow.maxAge) {
            zapovednik.countAnimals--
            println("У птицы превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.Eagle.age>zapovednik.Eagle.maxAge) {
            zapovednik.countAnimals--
            println("У птицы превышен максимальный возраст и оно удалилось с заповедника")
        }

        if (zapovednik.Ovcharka.age>zapovednik.Ovcharka.maxAge) {
            zapovednik.countAnimals--
            println("У собаки превышен максимальный возраст и оно удалилось с заповедника")
        }
        if (zapovednik.Pudel.age>zapovednik.Pudel.maxAge) {
            zapovednik.countAnimals--
            println("У собаки превышен максимальный возраст и оно удалилось с заповедника")
        }

    }

    println("${zapovednik.countAnimals}")
}

