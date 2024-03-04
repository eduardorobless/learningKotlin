package oo 


class Country(val name: String, val area: Int){ 
    constructor(name: String) : this(name, 0) {
        println("Constructor called")
    }
    fun print() = "$name, $area km^2"
}

fun main() {
    val australia = Country(name="Australia", 7_700_000)
    println(australia.name)
    println(australia.area)



    val spain = Country("Spain")
    println(spain.name)
    println(spain.area)
}