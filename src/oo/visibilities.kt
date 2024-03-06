package oo 

// private - same as in java 
// protected - same as in java 
// internal - visible inside same module 
// public same as in java (Default)
private val i = 42


open class Car(val brand: String, private val model: String) {
    protected fun getModel() = model
}




class SpecificCar: Car("", "specific") {
    fun a(): String {
        return getModel()
    }
}








fun main(args: Array<String>) {
    val car = Car("Brand", "Model")
    
    // only access from class
    println(car.brand)
    //println(car.model) //only from the class
    

    // accessing a protected method
    val specificCar = SpecificCar()
    println(specificCar.a())


    // accessing top level private property
    println(i)
 
}
