fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInt : Int = try {
        input.toInt()
    }catch (e: NumberFormatException){
        0
    }

    val output = when(inputAsInt){
        3 -> "You entered 3"
        5 -> "You entered 5"
        in 4..20 -> "You entered a number in the range 4 to 20"
        else -> "I have no idea, what you entered!"
    }
    println(output)
}