class U_Float_or_int {

    fun main (){
        var readinput = readLine()!!.trim()
        //var (aa, bb) = readinput.split(" ")
        var a = readinput.toFloat()
        var y = a.toInt()
        var diff = a - y
        var parsdiff = String.format("%.3f",diff)
        if (a - y > 0) {
            println("float ${a.toInt()} ${parsdiff}")

        } else {
            println("int ${a.toInt()}")
        }
    }
}