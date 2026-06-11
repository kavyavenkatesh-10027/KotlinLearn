class Bytecode {
    data class Product(val id: Int, val name: String, val price: Double)

    fun Int.isEven(): Boolean = this % 2 == 0;

    val x = 10
    var y = 20


    val p: Product? = null
    val something: String = ""
    val label = p?.name?.uppercase() ?: "no product"

}