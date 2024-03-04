package oo 

// Generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)




fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")


    // toStrimg()
    println(residence)

    // Referecial equality 
    println(residence === residence2)

    //  structural equality, equals()
    println(residence == residence2)

    // copy() 
    val neighbor = residence.copy(number=43)
    println(neighbor)

    // destructuring operator 

    residence.component1()
    val (street, number, postCode, city) = residence 
    println(("$street $number, $postCode $city"))
}