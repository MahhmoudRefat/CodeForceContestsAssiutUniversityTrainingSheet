fun main() {
    var readinput = readLine()!!.trim()
    var (aa, ss, bb) = readinput.split(" ")
    var a = aa.toInt()
    var s = ss.toString()
    var b = bb.toInt()
    when (s) {
        ">" -> if (a > b) println("Right")
        else println("Wrong")

        "<" -> if (a < b) println("Right")
        else println("Wrong")

        "=" -> if (a == b) println("Right")
        else println("Wrong")
    }
}
