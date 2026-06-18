class PriSecConstructors {
    fun main() {
        //Primary constructor
        val s1 = StudentPrim("Alice", 20)

        println(s1.name) // Alice
        println(s1.age)  // 20

        //Primary constructor with Init example
        val s2 = StudentPrimInit("Bob", 21)

        //Secondary constructor example
        val s3 = StudentSec("Alice", 20)
        val s4 = StudentSec("Bob")

        //Multiple Secondary constructor example
        val e1 = Employee(101, "John")
        val e2 = Employee(102)
        val e3 = Employee()

        println("${e1.id} ${e1.name}")
        println("${e2.id} ${e2.name}")
        println("${e3.id} ${e3.name}")
    }
    //Primary
    class StudentPrim(
        val name: String,
        val age: Int
    )


    //Primary with Init block
    class StudentPrimInit(
        val name: String,
        val age: Int
    ) {
        init {
            if(name.isBlank()){
                throw IllegalArgumentException("Name cannot be left blank")
            }
            if(age !in 0..1000){
                throw IllegalArgumentException("Invalid age")
            }
            println("Creating student: $name")
        }
    }


    //Secondary
    class StudentSec(
        val name: String,
        val age: Int
    ) {

        constructor(name: String) : this(name, 18) {
            println("Age not provided. Using default age 18.")
        }
    }


    //MultiSecondary
    class Employee(
        val id: Int,
        val name: String
    ) {

        constructor(id: Int) : this(id, "Unknown")//Used for assigning default value, when not available

        constructor() : this(0, "Guest")
    }


}