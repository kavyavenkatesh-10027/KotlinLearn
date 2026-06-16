
fun main() {
//Hidden Implementation
    processPayment(CreditCard(), 1000.0)
    processPayment(UPI(), 500.0)
    processPayment(Cash(), 200.0)

//Default Implementation
    val service = UserService()
    service.log("User created")

//Combined Field Implementation
    Dog().makeSound()
    Cat().makeSound()

}

interface PaymentMethod {// This when the implementation is completely layered
    fun pay(amount: Double)
}

fun processPayment(paymentMethod: PaymentMethod, amount: Double) {
    paymentMethod.pay(amount)
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paid $$amount using Credit Card")
    }
}

class UPI : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paid $$amount using UPI")
    }
}

class Cash : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paid $$amount in Cash")
    }
}


interface Logger {// This when the implementation is default
    fun log(message: String) {
        println("LOG: $message")
    }
}

class UserService : Logger


interface Animal {
    val sound: String //Abstract by default

    fun makeSound() {
        println("The sound we hear is $sound")
    }
}

class Dog : Animal {
    override val sound = "Woof"
}

class Cat : Animal {
    override val sound = "Meow"
}
