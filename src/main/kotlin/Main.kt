fun main() {
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