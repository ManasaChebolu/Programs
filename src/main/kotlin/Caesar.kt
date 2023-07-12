
import java.util.Scanner
fun main() {
    val scanner=Scanner(System.`in`)
    val str= readLine()
    var shift=scanner.nextInt()
    var res:String=""
    if (str != null) {
        for(j in str) {
            res+=caesarCipher(j,shift)
        }
        println(res)
    }
    else{
        println("String should not be empty")
    }
}

fun caesarCipher(j:Char,shift:Int):Char{
    if (!j.isLetter()) {
        return j
    } else {
        var d = j
        var c = shift
        while (c != 0) {
            if (d != 'z' && d!='Z') {
                d += 1
                c -= 1
            } else {
                d = if(j.isLowerCase()) 'a' else 'A'
                c -= 1
            }
        }
        return d
    }
}



