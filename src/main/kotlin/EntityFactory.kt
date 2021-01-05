interface IdProvider {
    fun getId() : String
}

class Entity private constructor(val id: String) {
    companion object : IdProvider {
        const val id = "id"

        override fun getId() : String {
            return "id 232232"
        }

        fun create() = Entity(getId())
    }
}


fun main() {
    val entity = Entity.create()
    println(Entity.id)

}
