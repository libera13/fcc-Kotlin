class Person( private val firstName: String = "kings", private val lastName: String = "robert") {

    var nickName: String? = null
    set(value) {
        println("value $field")
        field = value
        println("value $field")
    }
    fun printInfo() {
            val nickToPrint = nickName ?: "no nicknsame"
        println("$nickToPrint $lastName")
    }
}

//class Person(val name: String) {
//    var children: MutableList<Person> = mutableListOf()
//    constructor(name: String, parent: Person) : this(name) {
//        parent.children.add(this)
//    }
//}
