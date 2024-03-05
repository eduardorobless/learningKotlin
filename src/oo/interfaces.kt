package oo 

interface Drivable {
    fun drive()
}


class Bycicle :Drivable {
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
    val drivable: Drivable = Bycicle()
    drivable.drive()
}