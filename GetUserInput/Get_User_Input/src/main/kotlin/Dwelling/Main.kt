package Dwelling

fun main(args: Array<String>) {

  val roundHut = RoundHut(3, 10.0)
  val roundTower = RoundTower(4, 15.5)
  val squareCabin = SquareCabin(6, 50.0)


  with(squareCabin) {
    println("\nSquare Cabin\n============")
    println("Capacity: $capacity")
    println("Material: $buildingMaterial")
    println("Has room? ${hasRoom()}")

    println("Floor area: ${floorArea()}")
  }
  with(roundHut) {
    println("\nRound Hut\n=========")
    println("Material: $buildingMaterial")
    println("Capacity: $capacity")
    println("Has room? ${hasRoom()}")

    println("Floor area: ${floorArea()}")

    println("Has room? ${hasRoom()}")
    getRoom()
    println("Has room? ${hasRoom()}")
    getRoom()

    println("Carpet Length: ${calculateMaxCarpetLength()}")
  }
  with(roundTower) {
    println("\nRound Tower\n==========")
    println("Material: $buildingMaterial")
    println("Capacity: $capacity")
    println("Has room? ${hasRoom()}")

    println("Floor area: ${floorArea()}")

  }
}