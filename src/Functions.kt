
fun main(){
    println("Enter a string")
    val input = readln()

    var reversedString = reversed(stringToReverse = input) //This is the normal way of calling a function
    reversedString = input.reversedExtension() //This is how you call an extension function

    println(reversedString)

    if(input == reversedString){
        println("It's a palindrome!")
    }
}

fun reversed(
    stringToReverse : String = "Hello world" // Here = is used to declare a default value
) : String{
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return finalString
}

fun String.reversedExtension() : String { // Here you make this function extendable
    val finalString = buildString {
        for (i in this@reversedExtension.lastIndex downTo 0){
            append(this@reversedExtension[i])
        }
    }
    return finalString
}
