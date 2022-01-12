sealed class FireType {
    object singleShot
    data class multiShot (
            val queue: Int
    )
}


