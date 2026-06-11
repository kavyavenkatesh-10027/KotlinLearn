
fun main() {
    println("Please enter a number:")
    val input = readln()
    val inputAsInt = input.toIntOrNull()

//Way 1:
    if (inputAsInt == null) {
        println("Dude, enter a number!")
    } else if (inputAsInt % 2 == 0) {
        println("The number is even")
    } else {
        println("The number is odd")
    }

//        Way 2:
    val output = if (inputAsInt == null) {
        "Dude, enter a number!"
    } else if (inputAsInt % 2 == 0) {
        "The number is even"
    } else {
        "The number is odd"
    }
    println(output)

//Way 3:
    if (inputAsInt != null) {
        val result = when {
            inputAsInt % 2 == 0 ->"It's even"
//                inputAsInt % 2 ==1 -> "It's odd"
            inputAsInt > 10 ->"It's an odd number at least 11"
        else ->null
        }
    }
    println("You entered $inputAsInt")
}