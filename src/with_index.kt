fun main() {
    var primeNumbers = intArrayOf(2,3,5,7,11)
    for ((index, number) in primeNumbers.withIndex()){
        println("primeNumber(${index+1}): $number")
    }

}