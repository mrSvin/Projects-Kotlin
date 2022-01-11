import kotlin.math.roundToInt

class Dog(energy: Int, weight: Int, maxAge: Int, name: String) : Animal(energy, weight, maxAge, name) {
    override val life = "бежит"

    override fun createChildren(): Dog {
        val chidrenName = name
        val chldrenMaxAge = maxAge
        val chldrenEnergy = 1+(Math.random() * 9).roundToInt()
        val chldrenWeight = 1+(Math.random() * 4).roundToInt()
        println("Рождено ${chidrenName}, максимальный возраст ${chldrenMaxAge}, энергия ${chldrenEnergy}, вес ${chldrenWeight} ")
        return Dog(chldrenEnergy, chldrenWeight, chldrenMaxAge, chidrenName)
    }
}