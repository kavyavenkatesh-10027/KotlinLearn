fun main() {

    // ARITHMETIC OPERATORS
    var x = 9

    x = x + 5      // Long form
    x += 5         // Short form

    // Similarly:
    x -= 6
    x *= 6
    x /= 6
    x %= 5         // Modulo assignment

    val y = 6

    println(x + y) // Addition
    println(x - y) // Subtraction
    println(x * y) // Multiplication
    println(x / y) // Integer division (decimal part is discarded)
    println(x % y) // Remainder (Modulo)

    /*
     * Modulo (%) Use Cases:
     * - Check if a number is even or odd
     * - Find every nth element
     */

    
    // EQUALITY OPERATORS
    println(x == y)    // true if values are equal
    println(x != y)    // true if values are different

    // In Kotlin:
    // ==  compares CONTENTS (calls equals())
    // === compares REFERENCES (same object?)

    val list1 = mutableListOf(1, 2, 3)
    val list2 = mutableListOf(1, 2, 3)
    val list3 = list1

    println(list1 == list2)    // true (same contents)
    println(list1 === list2)   // false (different objects)
    println(list1 === list3)   // true (same reference)

    
    // RELATIONAL OPERATORS
    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)

    // Example
    println("Is x even? ${x % 2 == 0}")

    
    // LOGICAL OPERATORS
    println(x % 2 == 0 && x > y)   // AND
    println(x > y || y % 2 == 0)   // OR

    var condition = true

    println(!condition)            // NOT

    /*
     * && and || are short-circuit operators.
     * If the answer can be determined from the left side, the right side is NOT evaluated.
     */

    // Example:
    var a = 0
    false && (++a > 0)
    println(a)     // 0 (increment never happened)

    
    // INCREMENT / DECREMENT
    var n = 5

    //Post-increment
    println(n++)   // Prints 5, then becomes 6
    println(n)     // 6

    //Pre-increment
    println(++n)   // Becomes 7, then prints 7

    //Post-decrement
    println(n--)   // Prints 7, then becomes 6
    //Pre-decrement
    println(--n)   // Becomes 5, then prints 5



    // RANGE OPERATORS
    println(5 in 1..10)      // true
    println(15 !in 1..10)    // true

    for (i in 1..5) {
        print("$i ")         // 1 2 3 4 5
    }

    for (i in 1 until 5) {
        print("$i ")         // 1 2 3 4
    }

    for (i in 10 downTo 1 step 2) {
        print("$i ")         // 10 8 6 4 2
    }

    
    // TYPE CHECK OPERATORS
    val value: Any = "Kotlin"

    println(value is String)     // true
    println(value !is Int)       // true

    if (value is String) {
        // Smart cast: no explicit cast needed
        println(value.length)
    }

    
    // SAFE CALL OPERATOR (?.)
    val name: String? = null

    println(name?.length)
    // Returns null instead of throwing NullPointerException

    
    // ELVIS OPERATOR (?:)
    val username = name ?: "Guest"
    println(username)

    // If name is null, "Guest" is used.

    
    // NOT-NULL ASSERTION (!!)
    val city: String? = "Chennai"
    println(city!!.length)

    // WARNING:
    // If city were null, this would throw NullPointerException.


    // CAST (as?)
    val obj: Any = 123

    //Safe cast
    val str = obj as? String
    println(str)       // null instead of exception

    //Unsafe cast:
     val s = obj as String   // Would throw ClassCastException



    // BITWISE OPERATORS

    /*
    Bitwise operators work on the binary representation of integers.

    Decimal  Binary
    ----------------
    5        0101
    3        0011
    8        1000

    Unlike Java, Kotlin uses named infix functions instead of symbols.
    */

// ---------- AND ----------
// Bit is 1 only if BOTH bits are 1

    println(5 and 3)
// 0101
// 0011
// ----
// 0001  => 1

// ---------- OR ----------
// Bit is 1 if EITHER bit is 1

    println(5 or 3)
// 0101
// 0011
// ----
// 0111 => 7

// ---------- XOR ----------
// Bit is 1 only if bits are DIFFERENT

    println(5 xor 3)
// 0101
// 0011
// ----
// 0110 => 6

// ---------- INV (Bitwise NOT) ----------
// Flips every bit

    println(5.inv())
// 5 = 000...0101
// inv = 111...1010
// Result is -6 (two's complement representation)

// ---------- SHL (Shift Left) ----------
// Moves bits left by n positions
// Equivalent to multiplying by 2^n (when no overflow occurs)

    println(8 shl 1)   // 16
// 1000 -> 10000

    println(5 shl 2)   // 20
// 0101 -> 10100

// ---------- SHR (Signed Right Shift) ----------
// Moves bits right while preserving the sign bit
// Roughly equivalent to dividing by 2^n

    println(8 shr 1)   // 4
// 1000 -> 0100

    println(20 shr 2)  // 5

// ---------- USHR (Unsigned Right Shift) ----------
// Shifts right and fills leftmost bits with 0
// Mainly useful with negative numbers

    println(8 ushr 1)  // 4

//Quick Summary

    /*
    and   -> Common 1 bits
    or    -> Any 1 bit
    xor   -> Different bits
    inv() -> Flip all bits
    shl   -> Shift left (≈ multiply by 2)
    shr   -> Signed shift right (≈ divide by 2)
    ushr  -> Unsigned shift right
    */


// COMMON USE CASES

// Check if a number is even
    val n = 10
    println((n and 1) == 0)   // true //VVI

// Multiply by 2
    println(7 shl 1)          // 14

// Divide by 2
    println(20 shr 1)         // 10

// Toggle bits or combine flags
    val READ = 1      // 0001
    val WRITE = 2     // 0010
    val EXECUTE = 4   // 0100

    val permissions = READ or WRITE   // 0011
    println(permissions)              // 3
}