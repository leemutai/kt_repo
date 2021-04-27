fun main() {
    //using when as a replacement for an if-else-if chain
    var x: Any=6.86
    when(x){
        is Int-> println("$ is an Int")
        is String -> println("$x is not a Double")
        else -> println("none of the above")
    }// displays none of the above

}