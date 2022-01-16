object Weapons {
    fun createPistol() {
        val pistol = object : AbstractWeapon() {
            override val maxAmmoMagazine = 12
            override val fireType = FireType.singleShot.typeShot()
        }
    }

    fun createRogatka() {
        val rogatka = object : AbstractWeapon() {
            override val maxAmmoMagazine = 20
            override val fireType = FireType.singleShot.typeShot()
        }
    }

    fun createAvtomat() {
        val avtomat = object : AbstractWeapon() {
            override val maxAmmoMagazine = 30
            override val fireType = FireType.multiShot(maxAmmoMagazine).typeShot()
        }
    }

    fun createPulemet() {
        val pulemet = object : AbstractWeapon() {
            override val maxAmmoMagazine = 100
            override val fireType = FireType.multiShot(maxAmmoMagazine).typeShot()
        }
    }

}


