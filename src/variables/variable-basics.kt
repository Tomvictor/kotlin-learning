package variables


fun main(args: Array<String>) {
    var name: String = "hello world"
    println(name)

    //val --> constants cant be modified
    val inte:Int = 12
    println("integer $inte")

    var pi:Float = 3.14F
    println("value of pi is $pi")

    var sum:Double

    sum = 13.0 + 26.0
    println("sum : $sum")
}