//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val car = Car("Subaru", "legacy","white", 30)
    car.carry(45)
    car.identity()
    println(car.calculateParkingFees(3))
    val bus = Bus("Lorry", "subary", "yellow", 45)
    bus.maxTripFare(67.98)
  println(bus.calculateParkingFees(7))
}
open class Car(var make: String, var model: String, var color: String, var capacity: Int){
    fun  carry(people: Int){
        if (people==capacity){
        println("Carrying $people passengers")
    }
        else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours: Int): Int{
        var parkingFees =hours*20
        return parkingFees

    }
}
class Bus(make: String, model: String, color: String, capacity: Int): Car(make, model, color, capacity){
   fun maxTripFare(fare: Double): Double{
     return  fare*capacity
    }
override  fun calculateParkingFees(hours: Int): Int{
        return hours*capacity
    }
}