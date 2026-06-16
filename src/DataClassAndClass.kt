import kotlin.math.sqrt

fun main(){
    val rect1 = Rectangle(
        width = 5f,
        height = 7f
    )

    val rect2 = Rectangle(
        width = 5f,
        height = 7f
    )

    val rect3 = RectangleData(
        width = 5f,
        height = 7f
    )

    val rect4 = rect3.copy(//State: 1
        width = 15f
    )
//    val rect4 = RectangleData( // State: 2
//        width = 5f,
//        height = 7f
//    )
    println(rect1 == rect2)//Gives false for class cause oit stores only the memory address
    println(rect3 == rect4)// [NOTE: The answer is true for data classes] *** in State: 2

    println(rect1.width)
    println(rect1.height)
    println(maxArea(rect1, rect2))

    println(rect1)// Prints Rectangle@#memoryAddress for class
    println(rect3)// But prints a human-readable data in case of data classes

}

fun maxArea(rect1 : Rectangle, rect2 : Rectangle) : Float {
    val area1 = rect1.area
    val area2 = rect2.area
    return maxOf(area1, area2)
}

//Normal Class
class Rectangle(val width: Float, val height: Float){

    val diagonal = sqrt( width * width + height * height)

    val area = width * height
}

//Data Class
data class RectangleData(val width: Float, val height: Float){

    val diagonal = sqrt(( width * width + height * height).toDouble())

    val area = width * height
}

