class R_Age_in_Days {

    fun main (){
        var readinput = readLine()!!.trim()
        var n = readinput.toLong()
        var years = n / 365
        n %= 365
        var monthes = (n / 30 )
        n %= 30
        var days = n
        println("$years years")
        println("$monthes months")
        println("$days days")
    }
}