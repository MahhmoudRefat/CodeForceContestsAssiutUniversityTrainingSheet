class Y_The_last_2_digits {
    fun main(){
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
    }
}