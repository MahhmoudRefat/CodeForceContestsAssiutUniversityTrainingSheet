import java.util.*
import kotlin.math.min

fun main() {
    //var n = readln().toInt()
    var c = readln().single()
    var n = readln().toInt()
    var arr = IntArray(n+1)
    var h = ""
    for (i in 0..n) {
        h = readln()
        val integers = h.split(" ").map { it.toInt() }
        arr[i]= integers[i]
    }
    for (i in 0..n) {
        for (j in 0..arr[i]) {
            print(c)
        }
        println()
    }
}
/*   var readinput = readln().trim()
   var (aa, bb) = readinput.split(" ")
   var n = aa.toInt()
   var m = bb.toInt()*/



/*fun IsPrime(a: Int): Boolean {
    if (a == 2) return true
     for (i in 2 .. a/2){
         if (a % i == 0 )return false
     }
    return true
}*/