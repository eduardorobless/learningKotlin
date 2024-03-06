package oo 

import oo.House.Companion.getNormalHouse as createHouse // you can import compaion objects annd use aliases
import oo.I // import top level members (accessible)
object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}



fun main(args: Array<String>) {
    //CountryFactory.a
    println(CountryFactory.createCountry().name)
    // istantiating imported companio method
    val myHouse = createHouse()
    println("number of rooms of my house ${myHouse.numberOfRooms}")
    // getting value from imported top level propertie
    println("value of i: $I")
}