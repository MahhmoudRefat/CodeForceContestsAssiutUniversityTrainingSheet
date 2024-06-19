class M_Capital_or_Small_or_Digit {
    fun main (){

        var xx = readLine()!![0]
        var x = xx.code
        if (x in 48..64) {
            println("IS DIGIT")
        } else if (x in 65..96) {
            println("ALPHA")
            println("IS CAPITAL")
        } else {
            println("ALPHA")
            println("IS SMALL")

        }
    }
}