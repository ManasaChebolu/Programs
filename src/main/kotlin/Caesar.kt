
import java.util.Scanner
fun main() {
    val scanner=Scanner(System.`in`)
    val str= readLine()
    val shift=scanner.nextInt()
    var str1=" "
    if (str != null) {
        for(i in str) {
            val letter= if(i.isLetter())  i+shift else i
            str1 += letter
        }
     println(str1)
    }
    else
        println("String should not be empty")
}