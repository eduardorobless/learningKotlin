package oo 


import java.util.*


val list: List<Int> = listOf(1, 2, 3)


class TimeLine<E> {
    val date2Data: MutableMap<Date, E> = mutableMapOf()


    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}


fun main(args: Array<String>) {
    val timeline: TimeLine<Int> = TimeLine()
    timeline.add(2)
    println(timeline.getLatest())
}