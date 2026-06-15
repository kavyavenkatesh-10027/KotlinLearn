class Arrays {
    fun main() {
        val input = readln()
        val inputAsInteger = input.toIntOrNull()

        //Has fixed size : xArrayOf format... i.e. it's immutable (size) but mutable to edit values
         val favoriteNumbers= intArrayOf(1, 2, 3, 71) //Similarly has floatArrayOf, doubleArrayOf, Generic array
        //But we can do + and it will append the new element, but that happens after creating a new array instance
        favoriteNumbers +5

        if(inputAsInteger != null && inputAsInteger in 0..favoriteNumbers.lastIndex){
            println("Your number is ${favoriteNumbers.get(inputAsInteger)}")
        } else {
            println("That index doesn't exist")
        }
    }
}