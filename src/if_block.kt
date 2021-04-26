fun main() {
    var a =32
    var b =55

    var max=if (a>b){
        println("$a is greater than $b")
        a
    }else {
        println("$a is less than or equal to  $b")
        b
    }
    println("max($a,$b)=$max")
}
//output