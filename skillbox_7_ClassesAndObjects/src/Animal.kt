import kotlin.math.roundToInt
import kotlin.random.Random


open class Animal(energy: Int, weight: Int, maxAge: Int, name: String) {
    var energy = energy
    var weight = weight
    var maxAge = maxAge
    var name = name
    var age = 0
    open val life = "передвигается"
    val isTooOld: Boolean
        get() = this.age > maxAge

    fun sleep() {
        age++
        energy = energy + 5
        println("${name} спит")
    }

    fun eat() {
        weight++
        energy = energy + 3
        println("${name} ecт")
    }

    fun going() {
        weight--
        energy = energy - 5
        println("${name} ${life}")
    }

    fun tryIncrementAge() {
//        val randomcount = (Math.random() * 3).roundToInt()
        if (Random.nextBoolean() && age<maxAge && energy>0) {
            age++
            println("Произошло случайное увеличение возраста, теперь возраст составляет ${age} ")
        }
    }

    open fun createChildren(): Animal {
        val chidrenName = name
        val chldrenMaxAge = age
        val chldrenEnergy = 1+(Math.random() * 9).roundToInt()
        val chldrenWeight = 1+(Math.random() * 4).roundToInt()
        println("Рождено ${chidrenName}, максимальный возраст ${chldrenMaxAge}, энергия ${chldrenEnergy}, вес ${chldrenWeight} ")
        return Animal(chldrenEnergy, chldrenWeight, chldrenMaxAge, chidrenName)
    }

}
