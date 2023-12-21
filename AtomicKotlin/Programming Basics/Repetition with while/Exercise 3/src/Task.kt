// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
    var i = 0
    var sumEven = 0
    while (i <= n) {
        if (i % 2 == 0) {
            sumEven += i
        }
        i++
    }
    return sumEven
}

fun main() {
    println(sumOfEven(10))  // 30
}