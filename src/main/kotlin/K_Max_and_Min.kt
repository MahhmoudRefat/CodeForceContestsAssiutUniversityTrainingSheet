class K_Max_and_Min {
    fun main (){
        var inputreader = readln().trim()
        var (aa,bb,cc) = inputreader.split(" ")
        var a = aa.toInt()
        var b = bb.toInt()
        var c = cc.toInt()
        var maxtemp = 0
        var mintemp = 0
        if (a >= b && a >= c ){
            maxtemp = a
        }else if (b >= a && b >= c ){
            maxtemp = b
        }else if (c >= a && c >= b ){
            maxtemp = c
        }

        if (a <= b && a <= c ){
            mintemp = a
        }else if (b <= a && b <= c ){
            mintemp = b
        }else if (c <= a && c <= b ){
            mintemp = c
        }

        println("$mintemp $maxtemp")
    }
}