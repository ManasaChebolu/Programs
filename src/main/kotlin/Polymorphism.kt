open class Polymorphism {
    open fun method1() {
        println("Method1 in parent class ")
    }
    fun method2() {
        println("Method2 in parent class")
    }
}
class SubClass : Polymorphism() {
    override fun method1() {
        println("Method1 in child class")
    }
}
fun main() {
 val obj= Polymorphism()
    val obj1= SubClass()
    obj.method1()
    obj.method2()
    obj1.method1()
    obj1.method2()
}