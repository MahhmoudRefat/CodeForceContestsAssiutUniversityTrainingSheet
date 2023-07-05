fun main() {
    var readinput = readln().trim()
    var x: Int = readinput.first().code

    if (x % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
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