interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
    }
}

interface SessionInfoProvider {
    fun getSessionIdik()
}

open class BasicInfoProvider(val city: String) : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "basic info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("override printInfo")
    }

    protected open var sessionId: String = "Basic id"

    override fun getSessionIdik() {
        println(sessionId)
    }
    fun printMyCity() {
        println(city)
    }
}


fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is SessionInfoProvider")
        infoProvider.getSessionIdik()
    } else {
        println("is PersonInfoProvider")
    }
}




fun main() {
    val Koral = Person("Koral")
    val provider = BasicInfoProvider("Warszawa Basic")
    provider.printInfo(Koral)
    provider.printMyCity()
    checkTypes(provider)

    println("--------------")

    val fancy = FancyInfoProvider("szikago Fancy")
    fancy.printMyCity()
    fancy.getSessionIdik()
}
