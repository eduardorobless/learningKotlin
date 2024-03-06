package oo 

// private - same as in java 
// protected - same as in java 
// internal - visible inside same module 
// public same as in java (Default)



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
   
    println(car.brand)
    //println(car.model) // error 
    // println(car.getModel())


    val specificCar = SpecificCar()
    println(specificCar.a())
 
}
