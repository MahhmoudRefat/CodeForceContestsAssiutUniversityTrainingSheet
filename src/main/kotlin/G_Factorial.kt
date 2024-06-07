class G_Factorial {
    fun main (){
        var n = readln().toInt()
        while (n > 0) {
            val t = readln().toInt()
            var fac: Long = 1
            for (i in 1..t) {
                fac *= i.toLong()
            }
            println(fac)
            n--
        }
    }



}