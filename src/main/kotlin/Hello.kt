var bye: String? = "Do widzenia"

//fun witajcie(slowo: String, lista:List<String> = listOf("1", "afsdfsd")) {
//    lista.forEach{println("$slowo $it")}
//}
//fun witajcie(slowo: String, vararg lista:String = arrayOf("1", "afsdfafsdfsd")) {
//    lista.forEach{println("$slowo $it")}
//}

fun main() {
//    val emil: String = "ja"
//
//    bye = "1"
//    val goldWords: String = "$bye $emil"
//
//    when (bye) {
//        null -> println(goldWords)
//        else -> println(bye)
//    }

//    ### Lista ###

//    val ala = mutableListOf("aaa", "ccc", "a")
//    ala.add(1,"aaaaa")
//    witajcie("dzis jest", *arrayOf("2", "3"))

//    ### Iterator ###

//    var ala = listOf("aaa", "ccc", "a", 1, 2).listIterator()
//    var co1 = ala.next()
//    println(ala.next())
//    println(ala.next())
//    println(ala.next())
//    println(ala.next())
//    println(ala.next())
//    println(ala.next())

//    ### MAP ###
//    val map = mutableMapOf("abc" to 2, 2 to 3, 3 to 4, 2 to 5)
//    map.forEach(action = {println(it)})
//    println(map.getValue("abc"))

    val person = Person("ola")

    person.nickName = "Ava"
    println(person)
}
