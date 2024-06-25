class `N _har` {
    fun main (){
        var inputeline = readln()[0]
        var x = inputeline.code
        var x2 : Int = 0
        if (x in 65..96) {
            x2 = x + 32
        } else {
            x2 = x - 32
        }
        println(x2.toChar())
    }
}