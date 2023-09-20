import java.util.*

fun main() {

    var n = readln().toInt()
    for (i in 1.. n ){
        if (n % i == 0 ){
            println(i)
        }
    }

}

/*fun IsPrime(a: Int): Boolean {
    if (a == 2) return true
     for (i in 2 .. a/2){
         if (a % i == 0 )return false
     }
    return true
}*/