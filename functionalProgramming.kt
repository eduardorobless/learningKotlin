
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

fun mapAndFlatMap() {
    val list = (1..100).toList()
    val doubled = list.map {element -> element * 2} 
    //list.map(it * 2)
    val average = list.average()
    val shifted = list.map { it - average }
    println(doubled)
    println(shifted)


    // flatMap

    val nestedList= listOf(
        (1..10).toList(), 
        (11..20).toList(), 
        (21..30).toList()
    )

    val noFlattened = nestedList.map {it.sortedDescending()}
    val flattened = nestedList.flatMap{ it.sortedDescending() }
    println(noFlattened)
    println(flattened)
}


// for method reference
fun isEven(i: Int) = i % 2 == 0

// extension function
fun Int.even() = this % 2 == 0

fun main(args: Array<String>) {
    //highOrderFunctions()
    mapAndFlatMap()
}