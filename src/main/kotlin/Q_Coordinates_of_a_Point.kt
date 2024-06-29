class Q_Coordinates_of_a_Point {


fun main (){
    var readinput = readLine()!!.trim()
    var (xx, yy) = readinput.split(" ")
    var x = xx.toFloat()
    var y = yy.toFloat()
    if (x == 0f && y == 0f) {
        println("Origem")
    } else if (x != 0f && y == 0f) {
        println("Eixo X")
    } else if (x == 0f && y != 0f) {
        println("Eixo Y")
    } else if (x > 0 && y > 0) {
        println("Q1")
    } else if (x < 0 && y > 0) {
        println("Q2")
    } else if (x > 0 && y < 0) {
        println("Q4")
    } else if (x < 0 && y < 0) {
        println("Q3")
    }
}
}