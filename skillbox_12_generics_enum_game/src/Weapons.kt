object Weapons {

        val pistol = object : AbstractWeapon() {
            override val maxAmmoMagazine = 12
            override val fireType = FireType.singleShot.typeShot()
        }


        val rogatka = object : AbstractWeapon() {
            override val maxAmmoMagazine = 20
            override val fireType = FireType.singleShot.typeShot()
        }



        val avtomat = object : AbstractWeapon() {
            override val maxAmmoMagazine = 30
            override val fireType = FireType.multiShot(maxAmmoMagazine).typeShot()
        }



        val pulemet = object : AbstractWeapon() {
            override val maxAmmoMagazine = 100
            override val fireType = FireType.multiShot(maxAmmoMagazine).typeShot()
        }

}


