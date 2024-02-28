
fun variables() : Unit  {
    val name: String= "Eduardo Ignacio Robles Sosa"
    var age: Int= 24
    val isDeveloper: Boolean=true
    println("Name: $name is of Age is: $age")
    println("Is he a developer?: $isDeveloper")
}

fun nullSafety(): Unit {
    //val str: String= null // you cannot assign null to a variable
    val str: String? = null // to be able to assign null to a object variable use ?    
    println("string now is $str")
    //val str1: Int = null // same as with Int values 
    val str1: Int? = null // to be able to asign null to a object use ?
    println("int now is $str1")


    //println(str.length) // only safe or non-null assert calls allowed this avoids nullPointerExecption
    //println(str!!.length) // to force a non-safe call use !!., note that this may cause execption
    println(str?.length)// to force a safe-call use use ?. 
    val strLength = str?.length ?: 0
    println("Using elvis operator, length has a value of: $strLength")
}   

fun conditionals(): Unit {
     val i= 50
    // if (i < 15) {
    //     println("i is pretty small")
    // } else if (i >= 15 && i <= 25){
    //     println("i it's okay")
    // } else {
    //     println("i it's pretty large")
    // }

    val x =     if (i < 15) {
        println("i is pretty small")
        "small"
    } else if (i >= 15 && i <= 25){
        println("i it's okay")
        "okay"
    } else {
        println("i it's pretty large")
        "large"
    }

    println("i is $x")
}

fun main() {    
    //variables()
    //nullSafety()
    conditionals()
}