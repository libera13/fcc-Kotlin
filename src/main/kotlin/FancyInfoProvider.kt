class FancyInfoProvider(val city: String) : BasicInfoProvider() {
    override var sessionId: String = "Fancy sessionId"

    override val providerInfo: String
        get() = "moje fancy info"
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println(city)
    }
    fun printMyCity() {
        println(city)

    }
}
