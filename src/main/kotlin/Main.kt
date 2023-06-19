fun main() {
    val inputLine = readLine()!!.trim()
    var (aa, bb, cc, dd) = inputLine.split(" ", limit = 4)
    var a = aa.toInt()
    var b = bb.toLong()
    var c = cc.toInt()
    var d = dd.toLong()
    var x = (a * b) - (c * d)
    println("Difference = $x")
}