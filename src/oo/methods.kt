package oo 


class Robot(val name: String) {
    fun greetHuman() {
        println("Hello human my name is $name")
    }

    fun knowItsName(): Boolean = name.isNotBlank()
}




fun main(args: Array<String>) {
    val fightRobot = Robot("Destroyer9000")


    if(fightRobot.knowItsName()) {
        fightRobot.greetHuman()
    }
}