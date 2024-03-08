package oo 


import java.util.*


val list: List<Int> = listOf(1, 2, 3)


class Timeseries<E> {
    val date2Data: MutableMap<Date, E> = mutableMapOf()


    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}



fun <E> TimeseriesOf(vararg elements: E): Timeseries<E> {
    val result = Timeseries<E>()
    for(element in elements) {
        result.add(element)
    }
    return result
}


fun main(args: Array<String>) {
    val Timeseries: Timeseries<Int> = Timeseries()
    Timeseries.add(2)
    println(Timeseries.getLatest())


    val Timeseries2: Timeseries<Int> = TimeseriesOf(1, 2, 3)
    println(Timeseries2.getLatest())
}