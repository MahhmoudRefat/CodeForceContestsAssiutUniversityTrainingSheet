import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    var inputline = readLine()!!.trim()
    var (xx, yy) = inputline.split(" ", limit = 2)
    var x = xx.toFloat()
    var y = yy.toFloat()
    val floorResult = floor(x/y)
    val ceilResult = ceil(x/y)
    val roundResult = (x/y).roundToInt()
    println("floor ${x.toInt()} / ${y.toInt()} = ${floorResult.toInt()}")
    println("ceil ${x.toInt()} / ${y.toInt()} = ${ceilResult.toInt()}")
    println("round ${x.toInt()} / ${y.toInt()} = ${roundResult.toInt()}")

    //var floor : Int = x / y
    //  var ceil : Int = floor + 1
}