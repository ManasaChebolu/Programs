fun fibonacci(n:Int) {
  var a=0
    var b = 1
    println(a)
    var count = 1
    var temp:Int
    while(count<=n) {
        println(b)
        temp =a+b
        a=b
        b=temp
        count++
    }
}
fun main() {
    println(fibonacci(8))
}