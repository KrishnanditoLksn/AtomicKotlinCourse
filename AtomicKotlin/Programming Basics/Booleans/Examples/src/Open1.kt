// Booleans/Open1.kt

fun isOpen1(hour: Int) {
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val status =
    if (hour in open until closed) // [1]
      true
    else
      false
  println("Open: $status")

  /*when (hour) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
      print("x is neither 1 nor 2")
    }
  }*/
}

fun main() = isOpen1(6)
/* Output:
Operating hours: 9 - 20
Open: false
*/