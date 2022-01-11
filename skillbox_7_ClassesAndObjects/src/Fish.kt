import kotlin.math.roundToInt

class Fish(energy: Int, weight: Int, maxAge: Int, name: String) : Animal(energy, weight, maxAge, name) {
    override val life = "плывет"

    object FishChild {
        var chidrenName = "name"
        var chldrenMaxAge = 0
        var chldrenEnergy = 0
        var chldrenWeight = 0
    }

    override fun createChildren(): Fish {
        val chidrenName = name
        val chldrenMaxAge = maxAge
        val chldrenEnergy = 1+(Math.random() * 9).roundToInt()
        val chldrenWeight = 1+(Math.random() * 4).roundToInt()
        println("Рождено ${chidrenName}, максимальный возраст ${chldrenMaxAge}, энергия ${chldrenEnergy}, вес ${chldrenWeight} ")
        return Fish(chldrenEnergy, chldrenWeight, chldrenMaxAge, chidrenName)
    }

}