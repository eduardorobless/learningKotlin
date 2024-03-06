package oo


// inheratin same method from two different parents 



// RULES: 
// 1. When overriding from parents is ambiguouS:
//  Use parameterized the name of the class or interface you are reefrring to
// 2. You can override in child class using var of a val property but you cannot viceversa 
// As per the Liskov substitution principles
// 3. You must override all off the abstract methods of the abstract class


abstract class Vehicle (val brand: String=""){
    open fun drive() {
        println("Driving")
    }
    abstract fun honk()
}

class Sedan(override var brand: String = "BRAND"): Vehicle(), Drivable { //you cannot differentiate which drive method you are calling...
    override fun drive() {
        super<Drivable>.drive() // parameterized the name of the class or interface you are reefrring to
    }

    override fun honk(){
        println("honk")
    }
}


fun main(args: Array<String>) {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}