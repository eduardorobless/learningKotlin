package oo 


import java.util.*


val list: List<Int> = listOf(1, 2, 3)


class Timeline<E> {
    val date2Data: MutableMap<Date, E> = mutableMapOf()


    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}



fun <E> timelineOf(vararg elements: E): Timeline<E> {
    val result = Timeline<E>()
    for(element in elements) {
        result.add(element)
    }
    return result
}


fun main(args: Array<String>) {
    val timeline: Timeline<Int> = Timeline()
    timeline.add(2)
    println(timeline.getLatest())


    val timeline2: Timeline<Int> = timelineOf(1, 2, 3)
    println(timeline2.getLatest())
}