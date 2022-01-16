import java.util.Stack

abstract class AbstractWeapon() {
    open val maxAmmoMagazine = 30
    open val fireType = FireType.singleShot.typeShot()

    open var magazineAmmo = Stack<Int>()
    open val magazineNotEmpty = magazineAmmo.isEmpty()

    //Создание патрона необходимого типа
    fun generateAmmo(setAmmoType: Int) {
        if (setAmmoType == 1) {
            Ammo.damage1.critDamage(Ammo.damage1.value, Ammo.chanceCrit1.value, Ammo.coefCrit1.value)
        }
        if (setAmmoType == 2) {
            Ammo.damage2.critDamage(Ammo.damage2.value, Ammo.chanceCrit2.value, Ammo.coefCrit2.value)
        }
        if (setAmmoType == 3) {
            Ammo.damage3.critDamage(Ammo.damage3.value, Ammo.chanceCrit3.value, Ammo.coefCrit3.value)
        }

    }

    //Перезарядка (создаётся новый магазин и заполняется патронами с помощью функции создания патрона)
    fun rechargeMagazine() {
        magazineAmmo = Stack<Int>()
        for (i in 1..maxAmmoMagazine) {
            magazineAmmo.push(i)
        }
    }

    //Получение патронов (количество патронов в магазине должно уменьшаться).
    fun getAmmo(setAmmoType: Int) {
        magazineAmmo.pop()

        if (setAmmoType == 1) {
            Ammo.damage1.critDamage(Ammo.damage1.value, Ammo.chanceCrit1.value, Ammo.coefCrit1.value)
        }
        if (setAmmoType == 2) {
            Ammo.damage2.critDamage(Ammo.damage2.value, Ammo.chanceCrit2.value, Ammo.coefCrit2.value)
        }
        if (setAmmoType == 3) {
            Ammo.damage3.critDamage(Ammo.damage3.value, Ammo.chanceCrit3.value, Ammo.coefCrit3.value)
        }

    }

}


