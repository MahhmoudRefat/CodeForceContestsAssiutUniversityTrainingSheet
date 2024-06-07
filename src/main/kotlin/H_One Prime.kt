class `H_One Prime` {

    fun main (){
        var n = readln().toInt()
        var c = 0;
        for (i in 1..n / 2) {
            if (n % i == 0) {
                c++
            }
        }
        if (c == 1) println("YES")
        else println("NO")
    }


}