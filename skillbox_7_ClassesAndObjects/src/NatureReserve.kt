import kotlin.math.roundToInt

class NatureReserve {
    val pig = Animal(120, 35, 5, "Свинья")
    val horse = Animal(120, 35, 12, "Лошадка")

    val chiken = Bird(120, 35, 2, "Курочка")
    val petuh = Bird(120, 35, 2, "Петушок")
    val Straus = Bird(120, 35, 3, "Страус")
    val Crow = Bird(120, 35, 5, "Ворона")
    val Eagle = Bird(120, 35, 6, "Орел")

    val Okun = Fish(120, 35, 2, "Окунь")
    val Karas = Fish(120, 35, 3, "Карась")
    val Yaz = Fish(120, 35, 4, "Язь")

    val Ovcharka = Dog(120, 35, 10, "Овчарка")
    val Pudel = Dog(120, 35, 12, "Пудель")

    var countAnimals = 12


    fun randomAction() {

        val actionPig = (Math.random() * 4).roundToInt()
        val actionHorse = (Math.random() * 4).roundToInt()

        val actionChiken = (Math.random() * 4).roundToInt()
        val actionPetuh = (Math.random() * 4).roundToInt()
        val actionStraus = (Math.random() * 4).roundToInt()
        val actionCrow = (Math.random() * 4).roundToInt()
        val actionEagle = (Math.random() * 4).roundToInt()

        val actionOkun = (Math.random() * 4).roundToInt()
        val actionKaras = (Math.random() * 4).roundToInt()
        val actionYaz = (Math.random() * 4).roundToInt()

        val actionOvcharka = (Math.random() * 4).roundToInt()
        val actionPudel = (Math.random() * 4).roundToInt()


        if (actionPig==0) {
            pig.sleep()
        }
        if (actionPig==1) {
            pig.eat()
        }
        if (actionPig==2) {
            pig.going()
        }
        if (actionPig==3) {
            pig.createChildren()
            countAnimals++
        }

        if (actionHorse==0) {
            horse.sleep()
        }
        if (actionHorse==1) {
            horse.eat()
        }
        if (actionHorse==2) {
            horse.going()
        }
        if (actionHorse==3) {
            horse.createChildren()
            countAnimals++
        }

        if (actionChiken==0) {
            chiken.sleep()
        }
        if (actionChiken==1) {
            chiken.eat()
        }
        if (actionChiken==2) {
            chiken.going()
        }
        if (actionChiken==3) {
            chiken.createChildren()
            countAnimals++
        }

        if (actionPetuh==0) {
            petuh.sleep()
        }
        if (actionPetuh==1) {
            petuh.eat()
        }
        if (actionPetuh==2) {
            petuh.going()
        }
        if (actionPetuh==3) {
            petuh.createChildren()
            countAnimals++
        }

        if (actionStraus==0) {
            Straus.sleep()
        }
        if (actionStraus==1) {
            Straus.eat()
        }
        if (actionStraus==2) {
            Straus.going()
        }
        if (actionStraus==3) {
            Straus.createChildren()
            countAnimals++
        }

        if (actionCrow==0) {
            Crow.sleep()
        }
        if (actionCrow==1) {
            Crow.eat()
        }
        if (actionCrow==2) {
            Crow.going()
        }
        if (actionCrow==3) {
            Crow.createChildren()
            countAnimals++
        }

        if (actionEagle==0) {
            Eagle.sleep()
        }
        if (actionEagle==1) {
            Eagle.eat()
        }
        if (actionEagle==2) {
            Eagle.going()
        }
        if (actionEagle==3) {
            Eagle.createChildren()
            countAnimals++
        }

        if (actionOkun==0) {
            Okun.sleep()
        }
        if (actionOkun==1) {
            Okun.eat()
        }
        if (actionOkun==2) {
            Okun.going()
        }
        if (actionOkun==3) {
            Okun.createChildren()
            countAnimals++
        }

        if (actionKaras==0) {
            Karas.sleep()
        }
        if (actionKaras==1) {
            Karas.eat()
        }
        if (actionKaras==2) {
            Karas.going()
        }
        if (actionKaras==3) {
            Karas.createChildren()
            countAnimals++
        }

        if (actionYaz==0) {
            Yaz.sleep()
        }
        if (actionYaz==1) {
            Yaz.eat()
        }
        if (actionYaz==2) {
            Yaz.going()
        }
        if (actionYaz==3) {
            Yaz.createChildren()
            countAnimals++
        }

        if (actionOvcharka==0) {
            Ovcharka.sleep()
        }
        if (actionOvcharka==1) {
            Ovcharka.eat()
        }
        if (actionOvcharka==2) {
            Ovcharka.going()
        }
        if (actionOvcharka==3) {
            Ovcharka.createChildren()
            countAnimals++
        }

        if (actionPudel==0) {
            Pudel.sleep()
        }
        if (actionPudel==1) {
            Pudel.eat()
        }
        if (actionPudel==2) {
            Pudel.going()
        }
        if (actionPudel==3) {
            Pudel.createChildren()
            countAnimals++
        }


    }
}