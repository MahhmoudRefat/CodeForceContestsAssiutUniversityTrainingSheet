class AcceptedContests {
/*
     دى طريقة انى الف على عدد رق مرقم  اكتر من digit سواء احاد او عشرات او مئات وهكذا

 while (a > 0) {
            var x = a % 10
            if (x != 7 && x != 4) {
                flag = true
            }
            a /= 10
        }

 */

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
    /*
    S - Interval

    var readinput = readLine()!!.trim()
    var x = readinput.toFloat()
    if (x in 0f .. 25f  ){
        println("Interval [0,25]")
    }
    else if(x in 25f .. 50f  ){
        println("Interval (25,50]")
    }
    else if(x in 50f .. 75f  ){
        println("Interval (50,75]")
    }
    else if(x in 75f .. 100f  ){
        println("Interval (75,100]")
    }
    else {
        println("Out of Intervals")
    }
     */
    /*
    T. Sort Numbers

     var readinput = readLine()!!.trim()
    var (aa, bb, cc) = readinput.split(" ")
    var a = aa.toInt()
    var b = bb.toInt()
    var c = cc.toInt()
    if (a <= b && a <= c) {
        if (b <= c) {
            println("$a")
            println("$b")
            println("$c")
        } else {
            println("$a")
            println("$c")
            println("$b")
        }
    } else if (b <= a && b <= c) {
        if (a <= c) {
            println("$b")
            println("$a")
            println("$c")
        } else {
            println("$b")
            println("$c")
            println("$a")
        }
    } else if (c <= a && c <= b) {
        if (a <= b) {
            println("$c")
            println("$a")
            println("$b")
        } else {
            println("$c")
            println("$b")
            println("$a")
        }
    }
    println("")
    println("$a")
    println("$b")
    println("$c")
     */
    /*
    U. Float or int

     var readinput = readLine()!!.trim()
    //var (aa, bb) = readinput.split(" ")
    var a = readinput.toFloat()
    var y = a.toInt()
    var diff = a - y
    var parsdiff = String.format("%.3f",diff)
    if (a - y > 0) {
        println("float ${a.toInt()} ${parsdiff}")

    } else {
        println("int ${a.toInt()}")
    }
     */

/*
   V - Comparison
   var readinput = readLine()!!.trim()
    var (aa, ss, bb) = readinput.split(" ")
    var a = aa.toInt()
    var s = ss.toString()
    var b = bb.toInt()
    when (s) {
        ">" -> if (a > b) println("Right")
        else println("Wrong")

        "<" -> if (a < b) println("Right")
        else println("Wrong")

        "=" -> if (a == b) println("Right")
        else println("Wrong")
    }
 */
    /*
    W - Mathematical Expression
var readinput = readLine()!!.trim()
    var (aa, ss, bb , qq , cc) = readinput.split(" ")
    var a = aa.toInt() // the first number
    var s = ss.toString() // the operator
    var b = bb.toInt() // the second number
    var q = qq.toString() //the = operator
    var c = cc.toInt() // the result

    when (s) {
        "+" -> if (a + b == c ) println("Yes")
        else println(a+b)

        "-" -> if (a - b == c ) println("Yes")
        else println(a - b)

        "*" -> if (a * b == c ) println("Yes")
        else println(a * b)
    }

     */
    /*
    X. Two intervals

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
     */
    /*
    Y - The last 2 digits

    var readinput = readLine()!!.trim()
    var (aa, bb, cc, dd) = readinput.split(" ")
    var a = aa.toLong() % 100
    var b = bb.toLong() % 100
    var c = cc.toLong() % 100
    var d = dd.toLong() % 100
    var multiplication = (a * b * c * d) % 100
    if (multiplication < 10) {
        println("0$multiplication")
    } else {
        println(multiplication)
    }
     */
/*
 var readinput = readLine()!!.trim()
    var (aa, bb, cc, dd) = readinput.split(" ")
    var a = aa.toDouble()
    var b = bb.toDouble()
    var c = cc.toDouble()
    var d = dd.toDouble()
    if (b * Math.log(a) > d *Math.log(c)) {
        println("YES")
    } else {
        println("NO")
    }
 */
/*
B. Even Numbers

 var readinput = readLine()!!.trim()
    var (nn) = readinput.split(" ")
    var n = nn.toInt()
    if (n == 1 || n == 0 ) {
        println("-1")
    } else {
        for (i in 1..n) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }
 */
    /*
    while (true) {
        var pass = readln().toInt()
        if (pass == 1999) {
            println("Correct")
            exitProcess(0)
        } else {
            println("Wrong")
        }
    }
     */
    /*
    F - Multiplication table
     var n = readln().toInt()
    for (i in 1..12) {
       println("$n * $i = ${n*i}")
        }
     */
    /*
    G - Factorial *********************

    var n = readln().toInt()
    while (n > 0) {
        val t = readln().toInt()
        var fac: Long = 1
        for (i in 1..t) {
            fac *= i.toLong()
        }
        println(fac)
        n--
    }
     */
    /*
    H - One Prime

     var n = readln().toInt()
    var c = 0;
    for (i in 1..n / 2) {
        if (n % i == 0) {
            c++
        }
    }
    if (c == 1) println("YES")
    else println("NO")
     */
    /*
    I - Palindrome
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

     */
    /*
    J. Primes from 1 to n

     var n = readln().toInt()
    for (i in 2..n) {
        if (IsPrime(i)) {
            print("$i ")
        }
    }
}

fun IsPrime(a: Int): Boolean {
    if (a == 2) return true
     for (i in 2 .. a/2){
         if (a % i == 0 )return false
     }
    return true
}
     */

    /*
    K - Divisors

    var n = readln().toInt()
    for (i in 1.. n ){
        if (n % i == 0 ){
            println(i)
        }
    }

     */
    /*
    L. GCD
        //var n = readln().toInt()
    //var readinput = readln().trim()
    //var (aa, bb) = readinput.split(" ")
    //var n = aa.toInt()
    //var n2 = bb.toInt()
    var c = 0
    var mi = min(n, n2)

    for (i in 1..mi) {
        if (n % i == 0 && n2 % i == 0) {
            c = i
        }
    }
    println(c)

     */

    /*
    M - Lucky Numbers

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


     */
}
