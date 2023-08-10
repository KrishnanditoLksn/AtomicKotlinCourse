// StringTemplates/StringTemplates.kt

fun main() {
  val answer = 42
  println("Found $answer!")     // [1]
  println("printing a $1")      // [2]

  val arr : Array<Int> = arrayOf(1,2,1)
  val nilai = 2
  when (nilai){
    in arr -> println("wwllwlw")
    !in arr -> println("dwadwdaw")
  }
}
/* Output:
Found 42!
printing a $1
*/