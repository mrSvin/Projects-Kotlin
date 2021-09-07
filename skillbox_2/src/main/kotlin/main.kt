val firstName = "Oksana"
val lastName = "Vasileva"
var height = 180.0
val weight = 78.2F
val isChild: Boolean
    get() = height < 150 || weight < 40

val info: String
    get() = "$firstName $lastName, height: $height, weight: $weight, child: $isChild"

fun main(args: Array<String>) {
    println(info)
    height=110.0
    println(info)
}



