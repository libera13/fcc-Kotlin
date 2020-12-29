var bye: String? = "Do widzenia"


fun main() {
    val emil: String = "ja"

    bye = "1"
    val goldWords: String = "$bye $emil"

    when (bye) {
        null -> println(goldWords)
        else -> println(bye)
    }

}
