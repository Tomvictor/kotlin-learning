package lists

fun main(args: Array<String>) {
    var array = arrayOf("tom","don","rosily","victor")
    println(array[0])
    println(array.size)
    array[0] = "jesy"
    println(array[0])

    println("----------------------")

    var list = listOf("tom","don", "victor", "rosily")
    println(list.size)
    println(list[1])


    var arraylist = arrayListOf("tom","don")
    arraylist.add("victor")
    arraylist.add("rosily")
    println(arraylist)

}