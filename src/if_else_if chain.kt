fun main() {
    var age =49
    if (age<12){
        println("child")
    }else if (age in 12..17){
        println("Teen")
    }else if (age in 18..21){
        println("young adult")
    }else if (age in 22..30){
        println("Adult")
    }else if (age in 30..50){
        println("Middle Aged")
    }else {
        println("old")
    }
}