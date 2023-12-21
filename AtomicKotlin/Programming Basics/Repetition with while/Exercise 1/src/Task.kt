// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(param: String) {
    var i = 0
    while (i < param.length){
        println(param[i])
        i++
    }
}

fun main() {
    displayContent("abc")
}
/* Expected output:
a
b
c
*/