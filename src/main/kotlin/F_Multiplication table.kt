class `F_Multiplication table` {


    fun main (){
        var n = readln().toInt()
        for (i in 1..12) {
            println("$n * $i = ${n*i}")
        }
    }
}