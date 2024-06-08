class B_Even_Numbers {
    fun main (){
        var readinput = readLine()!!.trim()
        var (nn) = readinput.split(" ")
        var n = nn.toInt()
        if (n == 1 || n == 0 ) {
            println("-1")
        } else {
            for (i in 1..n) {
                if (i % 2 == 0) {
                    println(i)
                }
            }
        }
    }


}