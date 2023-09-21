import java.util.*
import kotlin.math.min

fun main() {
    //var n = readln().toInt()
    var readinput = readln().trim()
    var (aa, bb) = readinput.split(" ")
    var n = aa.toInt()
    var m = bb.toInt()
    var v = false
    for (i in n..m) {
        var a = i
        var flag = false
        while (a > 0) {
            var x = a % 10
            if (x != 7 && x != 4) {
                flag = true
            }
            a /= 10
        }
        if (!flag) {
            print("$i ")
            v = true
        }
    }
    if (!v) println("-1")
}

/*fun IsPrime(a: Int): Boolean {
    if (a == 2) return true
     for (i in 2 .. a/2){
         if (a % i == 0 )return false
     }
    return true
}*/