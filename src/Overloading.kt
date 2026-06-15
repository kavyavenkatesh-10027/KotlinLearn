
fun main(){
    println("Enter a string")
    val input = readln()
    println("Enter an integer")
    val inputAsInt = readln().toInt()

    val reversedString = reverseFunc(input)
    val reversedNumber = reverseFunc(inputAsInt)

    println(reversedString)
    println(reversedNumber)

    if(input == reversedString){
        println("It's a palindrome!")
    }
    if (inputAsInt == reversedNumber){
        println("That's a palindrome")
    }
}

fun reverseFunc(
    stringToReverse : String
) : String{
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return finalString
}

//#Overloading : signature is different
fun reverseFunc(
    integerToReverse : Int
) : Int{
    return integerToReverse.toString().reversed().toInt()
}