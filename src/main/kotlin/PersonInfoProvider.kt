interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
    }
}

interface SessionInfoProvider {
    val sessionId : String
    fun getSessionIdik()
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "moje info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("overrdideede")
    }

    override val sessionId: String
        get() = "2161367452673426735426734"

    override fun getSessionIdik() {
        println(sessionId)
    }
}


fun main() {
    val Koral = Person("Koral")
    val provider = BasicInfoProvider()
    provider.printInfo(Koral)
    provider.getSessionIdik()
}
