import java.util.Scanner
data class Shape(val length: Int,val breadth:Int) {
    fun area()=length * breadth

}
fun main() {
    val scanner=Scanner(System.`in`)
    var length=scanner.nextInt()
    var breadth=scanner.nextInt()
    var obj = Shape(length,breadth)
    println(obj)
    println(obj.area())
}