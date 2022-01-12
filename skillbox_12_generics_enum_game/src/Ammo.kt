enum class Ammo(val value: Int) {
    damage1(100),
    chanceCrit1(25),
    coefCrit1(4),

    damage2(120),
    chanceCrit2(40),
    coefCrit2(3),

    damage3(150),
    chanceCrit3(50),
    coefCrit3(2);

    fun critDamage(damage: Int, chanceCrit : Int, coefCrit : Int) {
        if (isChance(chanceCrit)) {
            println(damage * coefCrit)
        } else {
            println(damage)
        }
    }
}


