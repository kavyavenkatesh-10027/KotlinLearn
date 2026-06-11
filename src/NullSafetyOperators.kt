
    fun main(){
        println("Please enter another number:")
        val value = readln().toIntOrNull() ?: 0 // ?: is used to assign a default value if value becomes null

        println("Is value even? ${value%2 == 0}") // HERE, in case of invalid input, value become 0 and always prints true (since zero is even_number)

        println("Deposit money to increase cash by a rupee: ")
        val cash = readln().toIntOrNull() ?. inc() // null gets assigned to the value if the precedent of ? is null, without crashing the method chaining
        println("Your current cash balance is $cash")

    }
