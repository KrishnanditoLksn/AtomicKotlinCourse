// ObjectsEverywhere/Task1.kt
package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean {
  return s.reversed() == s;
}

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}