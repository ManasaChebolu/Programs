sealed class Animal {
    class Pig : Animal() {
        fun Pig() {
            println("Pig")
        }
    }
}
class Fox:Animal() {
    fun Fox() {
        println("Fox")
    }
}
fun main() {
    val obj=Animal.Pig()
    val obj1=Fox()
    obj.Pig()
    obj1.Fox()
}