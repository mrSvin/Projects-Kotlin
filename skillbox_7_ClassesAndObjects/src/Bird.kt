import kotlin.math.roundToInt



class Bird(energy: Int, weight: Int, maxAge: Int, name: String) : Animal(energy, weight, maxAge, name) {

    override val life = "летит"

    override fun createChildren(): Bird {
        val chidrenName = name
        val chldrenMaxAge = maxAge
        val chldrenEnergy = 1+(Math.random() * 9).roundToInt()
        val chldrenWeight = 1+(Math.random() * 4).roundToInt()
        println("Рождено ${chidrenName}, максимальный возраст ${chldrenMaxAge}, энергия ${chldrenEnergy}, вес ${chldrenWeight} ")
        return Bird(chldrenEnergy, chldrenWeight, chldrenMaxAge, chidrenName)
    }
}