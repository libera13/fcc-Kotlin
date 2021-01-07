import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;
    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
   fun create (type: EntityType) : Entity {
       val id = UUID.randomUUID().toString()
       val name = when (type) {
           EntityType.EASY -> type.getFormattedName()
           EntityType.MEDIUM ->  type.getFormattedName()
           EntityType.HARD ->  type.getFormattedName()
           EntityType.HELP ->  type.getFormattedName()
       }
       return when(type) {
           EntityType.EASY -> Entity.EASY(id, name)
           EntityType.MEDIUM -> Entity.MEDIUM(id, name)
           EntityType.HARD -> Entity.HARD(id, name, 1.0f)
           EntityType.HELP -> Entity.Help
       }
   }
}
sealed class Entity() {
    object Help : Entity() {
        val name = "help"
    }
    data class EASY(val id: String, val name: String): Entity() {
        fun makeMeFun() {
            println("hahaah")
        }
    }
    data class MEDIUM(val id: String, val name: String): Entity()
    data class HARD(val id: String, val name: String, val multplier: Float): Entity()
}

fun Entity.MEDIUM.printInfo() {
    println("hahaah medium")
}

fun main() {
    val entity : Entity = EntityFactory.create(EntityType.MEDIUM)
    var msg = when (entity) {
        Entity.Help -> 2
        is Entity.EASY -> 1
        is Entity.MEDIUM -> 3
        is Entity.HARD -> 4
    }
    if (entity is Entity.MEDIUM) {
        entity.printInfo()
    }

    Entity.MEDIUM("id", "name").printInfo()

    println(msg)
//    println(entity.name)

}
