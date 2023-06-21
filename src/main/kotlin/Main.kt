fun main() {
    var inputeline = readLine()!!.trim()
    var (nn, mm) = inputeline.split(" ", limit = 2)
    var n = nn.toLong()
    var m = mm.toLong()
    println((n % 10 )+( m % 10))
}