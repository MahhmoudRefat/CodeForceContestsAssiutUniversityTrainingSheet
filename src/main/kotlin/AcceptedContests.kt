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
    /*
    K. Max and Min

    var inputreader = readln().trim()
    var (aa,bb,cc) = inputreader.split(" ")
    var a = aa.toInt()
    var b = bb.toInt()
    var c = cc.toInt()
    var maxtemp = 0
    var mintemp = 0
    if (a >= b && a >= c ){
        maxtemp = a
    }else if (b >= a && b >= c ){
        maxtemp = b
    }else if (c >= a && c >= b ){
        maxtemp = c
    }

    if (a <= b && a <= c ){
        mintemp = a
    }else if (b <= a && b <= c ){
        mintemp = b
    }else if (c <= a && c <= b ){
        mintemp = c
    }

println("$mintemp $maxtemp")
     */


    /*
    L. The Brothers Problem code force

       var inputline = readln().trim()
    var (f1, s1) = inputline.split(" ")
    var inputline2 = readln().trim()
    var (f2, s2) = inputline2.split(" ")
    if (s1 == s2) {
        println("ARE Brothers")
    } else {
        println("NOT")
    }
     */
/*
M. Capital or Small or Digit

 var xx = readLine()!![0]
    var x = xx.code
    if (x in 48..64) {
        println("IS DIGIT")
    } else if (x in 65..96) {
        println("ALPHA")
        println("IS CAPITAL")
    } else {
        println("ALPHA")
        println("IS SMALL")

}
 */
/*
N - Char

 var inputeline = readln()[0]
    var x = inputeline.code
    var x2 : Int = 0
    if (x in 65..96) {
        x2 = x + 32
    } else {
        x2 = x - 32
    }
    println(x2.toChar())
 */
    /*
    P - First digit !

      var readinput = readln().trim()
    var x: Int = readinput.first().code

    if (x % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
     */
    /*
    Q. Coordinates of a Point

     var readinput = readLine()!!.trim()
    var (xx, yy) = readinput.split(" ")
    var x = xx.toFloat()
    var y = yy.toFloat()
    if (x == 0f && y == 0f) {
        println("Origem")
    } else if (x != 0f && y == 0f) {
        println("Eixo X")
    } else if (x == 0f && y != 0f) {
        println("Eixo Y")
    } else if (x > 0 && y > 0) {
        println("Q1")
    } else if (x < 0 && y > 0) {
        println("Q2")
    } else if (x > 0 && y < 0) {
        println("Q4")
    } else if (x < 0 && y < 0) {
        println("Q3")
    }
     */
/*
R - Age in Days

var readinput = readLine()!!.trim()
    var n = readinput.toLong()
    var years = n / 365
    n %= 365
    var monthes = (n / 30 )
    n %= 30
    var days = n
    println("$years years")
    println("$monthes months")
    println("$days days")
*/
}