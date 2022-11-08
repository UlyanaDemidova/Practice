import java.util.*

fun main(args: Array<String>) {
    //Task 1
    val myAge: Int = 17
    var isTeenager= myAge > 13 && myAge < 19
    println(isTeenager)

    //Task 2
    val theirAge = 30
    val bothTeenager = theirAge in 13..19 && myAge in 13..19
    println(bothTeenager)

    //Task 3
    val reader = "Demidova Ulyana"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)

    //Task 4
    val readerBeforeAuthor = reader < author
    println(readerBeforeAuthor)

    //Task 5
    val myAge2 = 17
    if (myAge2 in 13..19)
        println("Подросток")
     else
        println("Не подросток")

    //Task 6
    val answer = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

    //Task 7
    var counter = 0
    while (counter<10) {
        println(counter)
        counter = counter + 1
    }

    //Task 8
    var counter1 = 0
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter1 ++
    } while (roll != 0)
    println(counter1)
    //println("После $counter1 бросков, roll = $roll")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}