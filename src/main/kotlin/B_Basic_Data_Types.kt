class B_Basic_Data_Types {

    fun main (){
        val inputLine = readLine()!!.trim()
        val (intvariable, longvariable,charvariable,floatvariable,doubvariable) = inputLine.split(" ", limit = 5)
        val intvariablei = intvariable.toInt()
        val longvariablei = longvariable.toLong()
        val charvariablei = charvariable.single()
        val floatvariablei = floatvariable.toFloat()
        val doubvariablei = doubvariable.toDouble()
        println(intvariablei)
        println(longvariablei)
        println(charvariablei)
        println(floatvariablei)
        println(doubvariablei)
    }
}