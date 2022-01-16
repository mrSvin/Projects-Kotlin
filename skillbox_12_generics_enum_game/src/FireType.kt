sealed class FireType {
    object singleShot {
        fun typeShot(): String {
            return "single"
        }
    }
    data class multiShot (val queue: Int) {
        fun typeShot(): String {
            return "multi"
        }
    }
}


