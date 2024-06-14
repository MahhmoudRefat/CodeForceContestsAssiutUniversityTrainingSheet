class W_Mathematical_Expression {
    fun main (){
        var readinput = readLine()!!.trim()
        var (aa, ss, bb , qq , cc) = readinput.split(" ")
        var a = aa.toInt() // the first number
        var s = ss.toString() // the operator
        var b = bb.toInt() // the second number
        var q = qq.toString() //the = operator
        var c = cc.toInt() // the result

        when (s) {
            "+" -> if (a + b == c ) println("Yes")
            else println(a+b)

            "-" -> if (a - b == c ) println("Yes")
            else println(a - b)

            "*" -> if (a * b == c ) println("Yes")
            else println(a * b)
        }
    }
}