
import java.util.Random
val PI = 3.1415

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

fun conditionalIf(): Unit {
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

fun conditionalWhen(): Unit {
    // use when you want to cascade several options
    val price = 31
    when(price) {
        !in 0..0 -> println("price nnot free")
        1 -> println("For almost free today")
        in 1..19 -> println("On sale")
        in 20..29 -> println("Normal price")
        10 + 20   ->  println("price is 30")
        else -> println("overpriced")
    }


    when {
        price <= 19 -> println("cheap product")
        price <= 29 -> println("not so cheap product")
        else -> println("overpriced")
    }
}
fun collections(): Unit {
    // note that in kotling there are muttable and immutable collections 
    // the main ones are: list, map and sets, lets have fun 

    ////ARRAYS////
    // object array
    // val array = arrayOf(1, 2, 3, 4, 5)
    // println(array)
    // // any type array
    // val array2 : Array<Any?> = arrayOf(1, "two", 3, 4, "car")
    // println(array2)
    // println(array2.joinToString())

    // // int array
    // val array3 = intArrayOf(1, 1, 2, 3, 5, 8)
    // println(array3.joinToString())
 
    ////LISTS////
    // // immutable list 
    // val list = listOf(1, 1, 2, 3, 5)
    // for(element in list) {
    //     println(element)
    // }

    // // mutable list
    // val mutableList = mutableListOf(1, 1, 2, 3, 5)
    // mutableList.add(8)
    // for(mutableElem in mutableList) {
    //     println(mutableElem)
    // }

    ////SETS////
    // immutable set
    val set = setOf(1, 2, 3)
    // //set.add(4) // this should create an error -> unresolved reference: add
    // for(element in set) {
    //     println(element)
    // }

    // //mutable set 
    // val set2 = mutableSetOf(1, 2, 3)
    // set2.add(4) // allowed operation 
    // for(element in set2) {
    //     println(element)
    // }

    ///MAPS////
    // immutable map
    // val map = mapOf(Pair(1, "Kotlin"), Pair(2, "Java"))
    // //map.put(3, "C++") // should trow error
    // for((key, value) in map) {
    //     println("Key: $key, Value: $value")
    // }
    // // mutable map    
    // // using infix...
    // val mutableMap = mutableMapOf(1 to "Kotlin", 2 to "Java")
    // mutableMap.put(3, "C++") // should trow error

    // for((key, value) in mutableMap) {
    //     println("Key: $key, Value: $value")
    // }
    // COPIES////
    // Creating copies between collections using toList 
    val listCopy = set.toList()
    for(element in listCopy) {
        println(element)
    }


}


fun forLoop(): Unit {
    for (i in 1..10) {
        print("$i ")
    }    
    for (c in "Kotlin") {
        print("$c ")
    }
    val languages = listOf("Kotlin", "Java", "C")
    for (lang in languages) {
        println("$lang ")
    }

    for (i in 10 downTo 1) {
        print("$i ")
    }

       for (i in 10 downTo 1 step 2) {
        print("$i ")
    } 
}

fun whileLoop(): Unit {
    var i = 1

    while (i <= 10) {
        print("$i ")
        i++
    }   

    do {
        println(i)
        i++
    } while(i <= 20)
}


fun functions(age: Int): Boolean {
    return age >= 18
}

fun functionsShort(age: Int): Boolean = age >= 18
fun permitEntrance(vararg ages: Int): Boolean {
    return ages.any {age -> age >= 18}
}


/*
    Use the readLine() function to read an input from the command line

        Notice the return type of readLine(), and use what you learned to work with it

    The user should input their name

    If the user enters an empty string, store a default value

    Use an if expression to define a different greeting message based on whether the user entered a name


 */
fun challenge() {
    var userInput = readLine()
    val strLength = userInput?.length ?: 0
    if(strLength == 0) {
        print("string length is empty or null")
    } else {
        print("String length is $strLength")
    }

}


/*
    Create a collection of integers

    Use java.util.Random to fill the collection with 100 random numbers between 1 and 100.

    Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10

        Do it without using “if” or “when”
 */

fun challenge2() {
    val integers: MutableList<Int>  = mutableListOf()
    val random = Random()
    for(i in 1..100) {
        integers.add(random.nextInt(100) + 1)
    }


    var i = 0
    while(i < integers.size  && integers[i] > 10) {
        println(integers[i])
        i++
    }
    
}


fun concat(texts: List<String>, separator: String=",") = texts.joinToString(separator)

fun namedArgumentsAndDefaultParameters() {  
    val together = concat(texts = listOf("Kotlin", "Java", "Python", "Go")) // testing defafult , separator 
    val together2 = concat(separator="|", texts = listOf( "C", "C++", "C#"))
    println(together)
    println(together2)
}

fun exceptions() {

}

fun main(args: Array<String>) {    
    //variables()  
    //nullSafety()
    //conditionalIf()
    //conditionalWhen()
    //collections()
    //forLoop()
    //whileLoop()
    //print(functions(7))
    //print(functions(18))
    // println(functionsShort(5))
    // println(functionsShort(25))
    // println(permitEntrance(12, 18, 6))
    // println(permitEntrance(12, 4, 6)) 
    //challenge()
    //challenge2()

    namedArgumentsAndDefaultParameters()
}