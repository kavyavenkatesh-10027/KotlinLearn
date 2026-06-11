class Types {
    fun main() {
        val x = 5
        val y: Int = 5 //Integer
        println(x + y)

        val a = 5.0f
        val a2: Float = 5.0f //Float ~ 32 bits
        println(a+a2) // is less accurate

        val b = 5.123
        val b2: Double = 5.123 //Double ~ 64 bits
        println(b + b2) //is more accurate

        val c = true
        val c2: Boolean = true //Boolean ~ true/false
        println(c2)

        val d = "Hello, world!"
        val d2: String = "Hello, dear world!" //String

        //These are the primitive Data Types...
    }
}