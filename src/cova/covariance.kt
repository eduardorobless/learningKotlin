package cova

open class Being

open class Person : Being()

class Student: Person()

fun main(args: Array<String>) {
    // covariance: we can use a subtype
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) // covariance


    //people.add(Being())  // contravariace is not allowed as Beinng is a supertype of people 

    val p: Any = Person() // covariance; we can use a more derived type 
    val q: Person= Student() // covarinace; we can use a more derived type    

    
    // read only collections are covariant
    val students: List<Person> = listOf<Student>(Student(), Student()) // covariance

    // non read-only collections are not covariant
    //val students2: MutableList<Person> = mutableListOf<Student>()
    //students2.add(Person()) // type safety prevent that we cant add a Person object to above; invariance

    println(":)")


    // using kotling time series 

    val events: TimeSeries<Person>  = timeSeriesOf()
    val students3 : List<Student> = listOf(Student(), Student())
    events.addAll(students3) // covariance



    //using java time series
    val chartData: JavaTimeSeries<Person> = JavaTimeSeries<Person>()
    chartData.add(Student()) // covariance 
    chartData.addAll(students3) // ccvariance   

    JavaTimeSeries.greeting(); // testing mixed compilation of java and kotlin files
    

}
