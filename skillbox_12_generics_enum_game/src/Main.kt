import java.util.*

fun main(args: Array<String>) {

    val stack = Stack<Int>()

//    stack.push(1)
//    stack.push(2)
//    stack.push(3)
//
//    stack.pop()
//    println(stack.stack.get(0))
//    println(stack.stack.get(1))

    println(isChance(10))
//    Ammo.damage1.critDamage()
    Ammo.damage1.critDamage(Ammo.damage1.value, Ammo.chanceCrit1.value, Ammo.coefCrit1.value)
    Ammo.damage2.critDamage(Ammo.damage2.value, Ammo.chanceCrit2.value, Ammo.coefCrit2.value)
    Ammo.damage3.critDamage(Ammo.damage3.value, Ammo.chanceCrit3.value, Ammo.coefCrit3.value)

}

fun isChance(value: Int) : Boolean {
    var random = Random().nextInt(100)
    return random<value

}





