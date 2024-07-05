class Area_of_a_Circle_Problem {

    fun main  (){
        var r = readLine()!!.toDouble()
        val pi = 3.141592653
        var area: Double = pi * r * r
        val formatted = String.format("%.9f", area)
        println(formatted)

}
}