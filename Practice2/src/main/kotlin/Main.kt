fun main(args: Array<String>) {
    //Task 1
    val age1: Double = 42.0
    val age2: Double = 21.0
//я нажала и все было ок, оно показывала Int, но потом я сделала Double дабы сделать второе задание

    //Task 2
    val avg1 = (age1+age2)/2
    println(avg1)

    //Task 3 я сделала age1 и age2 Double

    //Task 4
    val firstName = "Ulyana"
    val lastName = "Demidova"

    //Task 5
    val fullName = "$firstName" + " " + "$lastName"
    println(fullName)

    //Task 6
    val myDetalis = "Привет! Меня зовут $fullName"
    println(myDetalis)

    //Task 7
    val date = Triple (8 ,11 ,22)

    //Task 8
    val (month, day, year) = date

    //Task 9
    println(month)
    println(day)
    println(year)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}