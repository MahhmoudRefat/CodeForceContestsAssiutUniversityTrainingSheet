fun main() {
var inputreader = readln().trim()
    var (aa,bb) = inputreader.split(" ")
    var a = aa.toInt()
    var b = bb.toInt()
    if (a%b == 0 || b%a == 0 ){
        println("Multiples")
    }
    else {
        println("No Multiples")
    }

}