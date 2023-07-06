fun main() {
    var name :String ?= null
    println(name)
    println(name?.length)  // safe calls
    println(name?.length ?: -1) // elvis operator
    println(name!!.length)  // not-null assertion operator
}