class Name {
    var name: String = ""
        get() = field	 // getter
        set(value) {		 // setter
            field = if(value.length<20) value else (-1).toString()
        }
    var age:Int =0
        get()=field
        set(value) {
            field= if(value>18) value else -1
        }
}
fun main() {
    val c = Name()
    c.name = "ManasaChebolu"
    println(c.name)
    c.age=12
    println(c.age)
}
