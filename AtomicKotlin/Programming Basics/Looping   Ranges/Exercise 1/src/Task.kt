// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1


fun factorial(n: Int): Long {
    var factor: Long = 1
    for (i in 1..n) {
        factor *= i.toLong()
    }
    return factor
}

fun main() {
    println(factorial(10))  // 3628800
}