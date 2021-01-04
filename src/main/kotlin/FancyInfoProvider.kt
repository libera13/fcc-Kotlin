class FancyInfoProvider(city: String) : BasicInfoProvider(city) {
    override var sessionId: String = "Fancy sessionId"

    override val providerInfo: String
        get() = "moje fancy info"
    override fun printInfo(person: Person) {
        super.printInfo(person)
    }
}
