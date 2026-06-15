
fun main(){
    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    //WHILE looop
    var sum = 0
    var numbers = intArrayOf()
    var i = 0
    while(i < amountOfNumbers){
        println("Please enter number #${i+1}")
        val number = readln().toIntOrNull() ?: continue
        sum+=number
        numbers += number
        i++
    }

    println("The total sum of numbers is $sum")
    println("Numbers : ${numbers.contentToString()}")//Otherwise gives the memory address of the array : [I@681a9515

    //FOR looop
    val numbersInCollectionList = mutableListOf<Int>()

    for (i in 0  until  amountOfNumbers){ //local variable, hence reusable
        println("Please enter number #${i+1}")
        val number = readln().toIntOrNull() ?: break
        numbersInCollectionList.add(number)
    }

    println("Numbers: $numbersInCollectionList")
    for (number in numbersInCollectionList){
        println(number)
    }

    //String are iterable too
    println("Enter a string:")
    val input = readln()

    for(i in input.lastIndex downTo 0){
        println(input[i])
    }

    //String builder
    val finalString = buildString {
        for (i in input.lastIndex downTo 0){
            append(input[i])
        }
    }

    println(finalString)
}