
import java.util.Scanner
fun main() {
    val str= readLine()
    val shift=Scanner(System.`in`).nextInt()
    var result=""
    if (str != null) {
        for(j in str)
            result+=caesarCipher(j,shift)
        println(result)
    }
    else
        println("String should not be empty")  
}

fun caesarCipher(j:Char,shift:Int):Char{
   return if (!j.isLetter())
        j
     else {
        var character = j
        var count = shift
        while (count != 0) {
            if (character != 'z' && character!='Z')
                character += 1
            else
                character = if(j.isLowerCase()) 'a' else 'A'
            count -= 1
        }
        character
    }
}



