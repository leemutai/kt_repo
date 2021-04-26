fun main() {
    var dayOfWeek = 6
    when(dayOfWeek) {
        1,2,3,4,5, -> println("Weekday")
        6,7 -> println("Weekend")
        else -> println("Invalid Day")
    }
}//dispalys weekend