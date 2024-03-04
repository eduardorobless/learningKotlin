package fp
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

fun takeAndDrop() {
    val list = (1..1000).toList() 
    val first10 = list.take(10)
    val remainingLast100 = list.drop(900)
    println(first10)
    println(remainingLast100)



    val listSequence = generateSequence(0) {
        println("Calculating ${it + 10}")
        it + 10
    }

    val firstSequence10 = listSequence.take(10).toList()
    val firstSequence20 = listSequence.take(20).toList()
    println(firstSequence10)
    println(firstSequence20)
}


fun zip() {
    val list = listOf("hi", "there", "kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // Pair<String, Boolean> 
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)
    println(zipped)
    // or with high order function 
    val mapping = list.zip(list.map {it.contains("t")} ) 
    println(mapping)
}




/*
We decided to gather data on the age of our users.

In this challenge, you'll be presented with this partly faulty data of user ages which is based on four input files:

    // Some faulty data with ages of our users
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )


Apply the functions you learned about as well as other functions from Kotlin's standard library to solve the following data analysis tasks:

    Find the average age of users (use only valid ages for the calculation!)
    Extract the names of input files that contain faulty data
    Count the total number of faulty entries across all input files
 */

fun challenge() {
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val ages = data.values.flatten() // flatten list of lists into a single list
    .filter {it >= 0} // filter non valida ages
    .map {it.toDouble()} // covert each int to double for a more accurate avg calculation

    if (ages.isNotEmpty()) {
        val avgAge = ages.average()
        println("Average age: $avgAge")        
     
    } else {
        println("No valid ages found")
    }




    val keysWithNegative = data.filterValues {it.any {it < 0}}.keys

    println("Ktes with neative values: $keysWithNegative")

    val sizeFaultyEntries = data.values.flatten()
    .filter{it < 0}
    .count()
    println(("Total number of faulty entries: $sizeFaultyEntries"))
    
    

    
}

// for method reference
fun isEven(i: Int) = i % 2 == 0

// extension function
fun Int.even() = this % 2 == 0

fun main(args: Array<String>) {
    //highOrderFunctions()
    //mapAndFlatMap()
    // takeAndDrop()
    //zip()
    challenge()
}