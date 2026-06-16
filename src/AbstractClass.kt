import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = RectangleData(
        width = 5f,
        height = 7f
    )
    val circle = CircleData(
        5f
    )

    sumOfAreas(rect1, circle)
}

fun sumOfAreas(vararg shapes: Shape): Double{
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

abstract class Shape(){
    abstract val area : Float
}

data class RectangleData(val width: Float, val height: Float) : Shape() {

    val diagonal = sqrt( width * width + height * height)

    override val area = width * height
}

data class CircleData(val radius: Float): Shape() {

    override val area = radius * radius * PI.toFloat()

    val diameter = radius * 2
}
