
//Singleton
import java.util.Scanner

object Math {
    init {
        println("Multiplication")
    }
    fun operation(x:Int,y:Int):Int {
        return x*y
    }
}
fun main() {

    val scanner=Scanner(System.`in`)
    val x=scanner.nextInt()
    val y=scanner.nextInt()
    println(Math.operation(x,y))


}