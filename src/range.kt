fun main() {
    var dayOfMonth = 20
    when(dayOfMonth){
        in 1..7 -> println("We're in first week of the month")
        !in 15..21 -> println("we're not in the third week of the Month")
        else -> println("none of the above")
    }//displays - we're in the first week of the Month
}