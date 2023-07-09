fun main() {
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