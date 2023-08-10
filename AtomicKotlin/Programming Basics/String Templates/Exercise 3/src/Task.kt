// StringTemplates/Task3.kt
package stringTemplatesExercise3

fun show(i : Int , s : String , c : Char , d : Double) {
    println("$i  \n + $s \n$c \n$d \n ")
}

fun main() {
//  show(1, "abc", 'd', 2.0)
show(1,"abc" ,'d' , 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/