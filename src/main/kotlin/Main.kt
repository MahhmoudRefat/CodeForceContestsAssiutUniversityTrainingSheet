fun main() {
    var inputline = readln().trim()
    var (f1, s1) = inputline.split(" ")
    var inputline2 = readln().trim()
    var (f2, s2) = inputline2.split(" ")
    if (s1 == s2) {
        println("ARE Brothers")
    } else {
        println("NOT")
    }
}