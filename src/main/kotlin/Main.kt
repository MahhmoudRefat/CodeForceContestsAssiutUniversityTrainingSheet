import java.util.*
import kotlin.math.min

fun main() {
    var readinput = readln().trim()
    var (aa, bb) = readinput.split(" ")
    var n = aa.toInt()
    var n2 = bb.toInt()
    var c = 0
    var mi = min(n, n2)
    //var n = readln().toInt()
    for (i in 1..mi) {
        if (n % i == 0 && n2 % i == 0) {
            c = i
        }
    }
    println(c)

}

/*fun IsPrime(a: Int): Boolean {
    if (a == 2) return true
     for (i in 2 .. a/2){
         if (a % i == 0 )return false
     }
    return true
}*/