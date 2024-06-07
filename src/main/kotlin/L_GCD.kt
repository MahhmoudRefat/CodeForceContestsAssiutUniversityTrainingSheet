import kotlin.math.min

class L_GCD {

    fun main (){
        //var n = readln().toInt()
        var readinput = readln().trim()
        var (aa, bb) = readinput.split(" ")
        var n = aa.toInt()
        var n2 = bb.toInt()
        var c = 0
        var mi = min(n, n2)

        for (i in 1..mi) {
            if (n % i == 0 && n2 % i == 0) {
                c = i
            }
        }
        println(c)
    }
}