// Hands-on 1: Class & Inheritance
// Tugas: Buat hierarki class kendaraan menggunakan open class, primary constructor,
// dan override fungsi. Vehicle adalah base class, Car dan Motorcycle adalah turunannya.

open class Vehicle(val name: String, val maxSpeed: Int) {

    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {
    override fun describe(): String {
        return super.describe() + " dan punya $numberOfDoors pintu"
    }
}

class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {
    override fun describe(): String {
        val sidecarStatus = if (hasSidecar) "(dengan sidecar)" else "(tanpa sidecar)"
        return super.describe() + " $sidecarStatus"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        Car("Toyota", 4),
        Motorcycle("Honda Beat Deluxe", false)
    )
    vehicles.forEach { println(it.describe()) }
}