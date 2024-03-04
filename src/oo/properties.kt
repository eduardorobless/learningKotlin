package oo 


class City {
    var name: String = ""
    get() = field // 'field' is a  backing field every propertie
    set(value) {
        if (value.isNotBlank()) { // check every value is not empty
            field = value
        }
    }
    var population: Int = 0
}


fun main(args: Array<String>) {
    val berlin = City()
    berlin.name = "Berlin" // in kotlin this will call the default setter method 
    berlin.name = ""
    berlin.population = 3_500_000  
    println(berlin.name)  // in jkotlin this will call the default getter method
    println(berlin.population)
}