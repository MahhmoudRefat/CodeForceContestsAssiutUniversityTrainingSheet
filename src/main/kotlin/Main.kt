fun main() {
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
}
