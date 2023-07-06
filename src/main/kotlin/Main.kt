fun main() {
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