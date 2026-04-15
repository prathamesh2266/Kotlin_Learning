import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val circle1 = circle(r = 5f)
    val rect1 = rectangle(width = 15F, height = 10F)
    val rect2 = rect1.copy()

}
    // Day 6 Abstract Class😊
    abstract class shape{
        var count = 0   // we cannot have variables int the interfaces

        abstract val area : Float
        abstract val circumference : Float

        fun increment(){
            count++
        }
    }

    data class rectangle(val width: Float, val height: Float): shape(){  // Implement the shape abstract with shape() // need to use () while extending abstract class

        val w = width
        val h = height
        val diagonal = sqrt(w * w + h * h)
        override val area: Float = w * h   // overriding the function of the interface
        override val circumference: Float = 2 * (w +h)



        fun issquare(): Boolean {
            return w == h
        }
    }



    data class circle(val r :Float): shape(){
        override val area: Float = r * r * PI.toFloat()
        override val circumference: Float = 2 * r * PI.toFloat()

    }
