class M_Lucky_Numbers {
    fun main (){
        var readinput = readln().trim()
        var (aa, bb) = readinput.split(" ")
        var n = aa.toInt()
        var m = bb.toInt()
        var v = false
        for (i in n..m) {
            var a = i
            var flag = false
            while (a > 0) {
                var x = a % 10
                if (x != 7 && x != 4) {
                    flag = true
                }
                a /= 10
            }
            if (!flag) {
                print("$i ")
                v = true
            }
        }
        if (!v) println("-1")
    }


}