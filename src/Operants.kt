
    fun main(){
        //ARITHMETIC OPERATORS
        var x = 9
        x = x + 5 //long form
        x+= 5 //short form

        //Similarly we have
        x-= 6
        x*= 6
        x/= 6

        var y = 6

        println(x+y) //Addition


        println(x-y) //Subtraction

        println(x*y) //Multiplication

        println(x/y) //Division
        //In the case of integer division the value will be a truncated quotient

        println(x%y) //Modulo(Remainder) : Use-case
        /* Use case:
        Can be used to determine the even-odd property of a number
         */


        //RELATIONAL OPERATOR
        var areXAndYNumbersEqual : Boolean = x==y //Equals operator returns boolean val
        println("Are x and y equal? : $areXAndYNumbersEqual")

        //Similarly we have:
        println(x>y)
        println(x<y)

        //Use-case (Modulo & Equals)
        println("Statement: X is an even number : ${x%2 == 0}")

        //LOGICAL (AND, OR, NOT)
        println(x%2 == 0 && x<y)
        println(x>y || y%2 == 0)

    }
