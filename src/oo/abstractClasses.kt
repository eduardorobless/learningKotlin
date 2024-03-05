package oo 

abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double): Shape(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}



fun main(){
    val shape = Circle("Large circle", 17.0)
    println(shape.area())
}