fun main() {
    for(x in 2..5)
        print("$x ")
    println()

    for(x in 5.downTo(1))
        print("$x ")
    println()

    for(i in 1.rangeTo(10)){
        if(i%2 == 0) {
            print("$i ")
        }
    }
    println()

    for(i in 1..10 step 2)
        print("$i ")
    println()
    println((1..10 step 3).first)

    var x= 2..7
    for(i in x.reversed())
        print("$i ")
}