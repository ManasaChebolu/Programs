//prime numbers upto 30
fun main() {
    for( i in 2..30){
        var count=0
        for(j in 2..i/2) {
            if(i%j==0) {
                count = 1
                break
            }
        }
        if(count==0)
            println(i)
    }
}