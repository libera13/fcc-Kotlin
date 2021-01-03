class Person(_firstName: String = "kings", val lastName: String = "robert") {

    var nickName: String? = null
    set(value) {
        println("value $field")
        field = value
        println("value $field")
    }
}

//class Person(val name: String) {
//    var children: MutableList<Person> = mutableListOf()
//    constructor(name: String, parent: Person) : this(name) {
//        parent.children.add(this)
//    }
//}
