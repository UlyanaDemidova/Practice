fun main(args: Array<String>) {
    val firstName = "Ulyana"
    val lastName = "Demidova"
    printFullName(firstName, lastName)
    val myFullName = calculateFullName(firstName, lastName)
    println(myFullName)
}
//Task 1
    fun printFullName(firstName: String, lastName: String){

        println("$firstName" + " " + "$lastName")
}


//Task 2, 3, 4
    fun calculateFullName(firstName: String, lastName: String): Pair <String, Int>  =
        Pair("$firstName $lastName", firstName.length+lastName.length)




