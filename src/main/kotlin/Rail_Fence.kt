import java.util.Scanner
fun main() {
    val str= readLine()
    val shift = Scanner(System.`in`).nextInt()
    if(str!=null) {
        val len = str.length
        val array= Array(shift) { CharArray(len) {' '} }
       val arr=railFence(array, str, len, shift)
        println(arr[0][1])
        for(row in 0..<shift) {
            for(column in 0..<len) {
                if(arr[row][column] != ' ') {
                    print(arr[row][column])
                }
            }
        }
    }else
        println("String cannot be empty")
}
fun railFence(array: Array<CharArray>, str: String, len: Int, shift:Int) : Array<CharArray> {
    var row=0
    var direction=0
 for(column in 0..<len) {
     array[row][column]= str[column]
     if(row==shift-1)
         direction = 1
     else if(row==0)
         direction=0
     if(direction==0)
         row++
     else
         row--
 }
    return array
}