class G_Summation_from_1_to_N {
    fun main (){
        var x = readLine()!!.toLong()
      var sum : Long= 0
        for(i in 1..x ){
            sum += i
        }
        println((x*(x+1))/2)
    }
}