package oo 




object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}



fun main(args: Array<String>) {
    //CountryFactory.a
    println(CountryFactory.createCountry().name)
}