
fun lambda() {
    val timesTwo =  {x: Int -> x*2}
    val add : (Int, Int) -> Int = {x: Int, y: Int -> x+y}
}


fun highOrderFunctions() {
    val list = (1..100).toList()
    println(list.filter({ element -> element % 2 == 0}))
    println(list.filter({ it % 2 == 0}))
    println(list.filter({it.even()}))
    println(list.filter(::isEven))
    // even remove last parantheses if last argument and only argument is lambda expression 
    println(list.filter {it.even()} )
}





// for method reference
fun isEven(i: Int) = i % 2 == 0

// extension function
fun Int.even() = this % 2 == 0

fun main(args: Array<String>) {
    highOrderFunctions()
}