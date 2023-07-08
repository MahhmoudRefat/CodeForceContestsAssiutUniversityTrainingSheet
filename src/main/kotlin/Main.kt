fun main() {
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

}
/*
var readinput = readLine()!!.trim()
    var (aa, ss, bb) = readinput.split("")
    var a = aa.toInt()
    var b = bb.toInt()
    var s = ss[0]
    var result : Int= 0
    if (s == '+') {
        result = a + b
    } else if (s == '−') {
        result = a - b
    } else if (s == '*') {
        result = a * b
    } else {
        result = a / b
    }
    println(result)
 */