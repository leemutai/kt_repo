fun main() {
    var dayOfWeek = 4
    var dayOfWeekInString = when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else->"Invalid Day"
     }
    println("Today is $dayOfWeekInString")// Today is Thursday
}