package oo 

interface Drivable {
    fun drive() {
        println("Driving interface")
    }
}


class Bicycle :Drivable {
    override fun drive() {
        println("Driving bycicle")
    }
}


class Boat: Drivable {
    override fun drive() {
        println("Driving boat")
    }
}



fun main(args: Array <String>) {
    val drivable: Drivable = Bicycle()
    drivable.drive()
}