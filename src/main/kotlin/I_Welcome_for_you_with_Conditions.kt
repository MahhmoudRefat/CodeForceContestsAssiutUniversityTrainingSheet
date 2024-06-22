class I_Welcome_for_you_with_Conditions {
    fun main (){
        var readinpute = readLine()!!.trim()
        var (aa, bb) = readinpute.split(" ", limit = 2)
        var a = aa.toInt()
        var b = bb.toInt()
        if (a >= b) {
            println("Yes")
        } else {
            println("No")
        }
    }
}