fun main(args: Array<String>) {
    test();
}

fun test() {

    var firstName: String = "Oksana";
    var lastName: String = "Vasileva";
    var height: Double = 180.0;
    var weight: Float = 78.2F;
    var isChild: Boolean;

    isChild = height < 150 || weight < 40
    info(firstName, lastName, height, weight, isChild);

    height = 120.0;
    isChild = height < 150 || weight < 40
    info(firstName, lastName, height, weight, isChild);

}

fun info(name: String, lastname: String, height: Double, weight: Float, isChild: Boolean) {
    var info: String = "";
    info = "$name $lastname, height: $height, weight: $weight, child: $isChild";
    println(info)
}

