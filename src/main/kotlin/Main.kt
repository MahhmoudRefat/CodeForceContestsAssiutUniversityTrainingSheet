fun main() {

    val inputLine = readLine()!!.trim()
    var(xx,yy) = inputLine.split(" " , limit = 2 )
    var x = xx.toInt()
    var y = yy.toLong()

    println("$x + $y = ${x + y}")
    println("$x * $y = ${x * y}")
    println("$x - $y = ${x - y}")
}