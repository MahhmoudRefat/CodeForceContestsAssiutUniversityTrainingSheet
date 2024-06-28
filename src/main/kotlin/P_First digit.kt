class `P_First digit` {

    fun main (){

        var readinput = readln().trim()
        var x: Int = readinput.first().code

        if (x % 2 == 0) {
            println("EVEN")
        } else {
            println("ODD")
        }
    }
}