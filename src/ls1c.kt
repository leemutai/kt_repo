fun main() {
    for (num in 1..100){
        if (num%3 == 0 && 5==0 ){
            println("First positive no divisible by both 3 and 5:${num}")
            break
        }
    }
}