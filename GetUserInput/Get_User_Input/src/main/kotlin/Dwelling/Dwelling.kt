package Dwelling

abstract class Dwelling(private var residents: Int) {
  abstract val buildingMaterial: String
  abstract val capacity: Int

  fun hasRoom(): Boolean {
    return residents < capacity
  }

  abstract fun floorArea(): Double

  fun getRoom() {
    if (capacity > residents) {
      residents++
      println("Tienes un cuarto")
    } else {
      println("Lo lamentamos, ya no hay espacio.")
    }
  }
}