class K_Divisors {
    fun main (){

        var n = readln().toInt()
        for (i in 1.. n ){
            if (n % i == 0 ){
                println(i)
            }
        }

    }


}
