package oo 


fun Bicycle.replaceWheel(){
    println("Replace wheel...")
}

fun Boat.startEngine(): Boolean{ 
    println("Starting engine")
    return true
}


fun main(args: Array<String>) {
    val vehicle: Drivable = Bicycle()


    vehicle.drive()

    if(vehicle is Bicycle){ // / Smart cast automatically cast vehicle to Bicycle
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }


    if(vehicle is Boat && vehicle.startEngine()) {
        //..
    }

    if(vehicle !is Boat || vehicle.startEngine()) {
        //..
    }
     
     if (vehicle !is Bicycle) {
        return 
     }

     vehicle.replaceWheel()


}