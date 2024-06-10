import kotlin.math.max
import kotlin.math.min

class `X_Two intervals` {
    fun main(){
        var readinput = readLine()!!.trim()
        var (ll1, rr1 , ll2,rr2) = readinput.split(" ")
        var l1 = ll1.toInt() // the first number
        var r1 = rr1.toInt() // the second number
        var l2 = ll2.toInt() // the result
        var r2 = rr2.toInt() // the result
        if (max(l1,l2) > min(r1,r2)) println("-1")
        else {
            println("${max(l1,l2)} ${min(r1,r2)}")
        }
    }
}