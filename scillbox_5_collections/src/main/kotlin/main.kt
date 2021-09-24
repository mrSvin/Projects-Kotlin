fun main(args: Array<String>) {

    val contactList = mutableListOf<String>()

    while (true) {
        println("Enter count numbers")
        try {
            val n = readLine()?.toInt() ?: return
            if (n > 0) {
                inputNumber(n, contactList)
                filterContact(contactList)
                uniqueContact(contactList)
                nameContact(contactList)

            } else {
                println("number must be >0")
            }
        } catch (e: NumberFormatException) {
            println("number must be >0")
        }

    }
}

fun inputNumber(n: Int, contactList: MutableList<String>) {
    for (i in 1..n) {
        println("Enter number $i")
        val number = readLine()?.toString() ?: return
        addContact(number, contactList)
    }
}

fun addContact(contact: String, contactList: MutableList<String>) {
    contactList.add(contact)
    println(contactList)
}

fun filterContact(contactList: MutableList<String>) {
    val filterContact = contactList.filter { it.startsWith("+7") }
    println("filter numbers: " + filterContact)
}

fun uniqueContact(contactList: MutableList<String>) {
    val uniqueContact = contactList.toSet()
    println("unique numbers " + uniqueContact)
    println("size contacts " + contactList.size)

    val contactLength = contactList.sumBy { it.length }
    println("sum length contacts " + contactLength)
}

fun nameContact(contactList: MutableList<String>) {
    val mapContact = mutableMapOf<String, String>()
    for (i in 0..contactList.size - 1) {
        println("Enter name contacts:" + contactList.get(i))
        val name = readLine()?.toString() ?: return
        mapContact.put(contactList.get(i), name)
    }
    mapContact.forEach { (key, value) ->
        println("Abonent: $value. Number phone: $key")
    }
    println(mapContact.toSortedMap())
    println(mapContact.toList().sortedBy { (key, value) -> value }.toMap())

}


