class AcceptedContests {
/*
* A - Say Hello With C++
* The code :-
* var name = readln().toString()
        println("Hello, $name")
* */
/**
 * val inputLine = readLine()!!.trim()
 *     var(xx,yy) = inputLine.split(" " , limit = 2 )
 *     var x = xx.toInt()
 *     var y = yy.toLong()
 *     println("$x + $y = ${x + y}")
 *     println("$x * $y = ${x * y}")
 *     println("$x - $y = ${x - y}")
 * */
/*B - Basic Data Types
*  the right answer:-
*   val inputLine = readLine()!!.trim()
    val (intvariable, longvariable,charvariable,floatvariable,doubvariable) = inputLine.split(" ", limit = 5)
    val intvariablei = intvariable.toInt()
    val longvariablei = longvariable.toLong()
    val charvariablei = charvariable.single()
    val floatvariablei = floatvariable.toFloat()
    val doubvariablei = doubvariable.toDouble()
    println(intvariablei)
    println(longvariablei)
    println(charvariablei)
    println(floatvariablei)
    println(doubvariablei)
    *
    * ****************************************************
* the wrong answer
* var intvariable: Int = readln().toInt()
    var longvariable: Long = readln().toLong()
    var charvariable: Char = readln().single()
    var floatvariable: Float = readln().toFloat()
    var doubvariable: Double = readln().toDouble()
    println(intvariable)
    println(longvariable)
    println(charvariable)
    println(floatvariable)
    println(doubvariable)
    * */
    /*
    *  val inputLine = readLine()!!.trim()
    var (aa, bb, cc, dd) = inputLine.split(" ", limit = 4)
    var a = aa.toInt()
    var b = bb.toLong()
    var c = cc.toInt()
    var d = dd.toLong()
    var x = (a * b) - (c * d)
    println("Difference = $x")
    * */

    /*
    Area of a Circle  Problem
    var r = readLine()!!.toDouble()
    val pi = 3.141592653
    var area: Double = pi * r * r
    val formatted = String.format("%.9f", area)
    println(formatted)
    * */
    /*F - Digits Summation
  var inputeline = readLine()!!.trim()
    var (nn, mm) = inputeline.split(" ", limit = 2)
    var n = nn.toLong()
    var m = mm.toLong()
    println((n % 10 )+( m % 10))

     */

    /*
    G - Summation from 1 to N

    var x = readLine()!!.toLong()
 //////  var sum : Long= 0
    for(i in 1..x ){
       sum += i
    }/////////
    println((x*(x+1))/2)
     */

    /*
    h- Two numbers
    import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt

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
     */
    /*
    I - Welcome for you with Conditions

    var readinpute = readLine()!!.trim()
    var (aa, bb) = readinpute.split(" ", limit = 2)
    var a = aa.toInt()
    var b = bb.toInt()
    if (a >= b) {
        println("Yes")
    } else {
        println("No")
    }
     */
    /*
    J. Multiples

    var inputreader = readln().trim()
    var (aa,bb) = inputreader.split(" ")
    var a = aa.toInt()
    var b = bb.toInt()
    if (a%b == 0 || b%a == 0 ){
        println("Multiples")
    }
    else {
        println("No Multiples")
    }
     */
}