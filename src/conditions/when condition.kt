package conditions

fun main(args: Array<String>) {
    var mode:Int = 4

    when (mode){
        1 -> println("mode is 1")
        2 -> println("mode is 2")
        3 -> {
           println("mode is 3")
        }
        else -> {
            println("oops, something went wrong")
        }
    }
}