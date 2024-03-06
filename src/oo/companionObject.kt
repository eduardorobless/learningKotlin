package oo


interface HouseFactory {
    fun createHouse(): House
}



class House(val numberOfRooms: Int, val price: Double) {
    companion object: HouseFactory {
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuyHouse() = House(42, 7_000_000.0)
        override fun createHouse() = getNormalHouse()
    }
}


fun main(args: Array<String>) {
    val normalHouse = House.createHouse()
    println(normalHouse.price)

    println(House.HOUSES_FOR_SALE)
}