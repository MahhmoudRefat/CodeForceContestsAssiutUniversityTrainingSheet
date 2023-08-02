import java.util.*

fun main() {
   // var n = readln().toInt()
    val sc = Scanner(System.`in`)
    val a = sc.next()
    var b = ""
    for (i in a.length - 1 downTo 0) {
        b += a[i]
    }
    val a1: Int
    val b2: Int
    a1 = a.toInt()
    b2 = b.toInt()
    println(b2)
    if (a1 == b2) println("YES") else println("NO")

}

