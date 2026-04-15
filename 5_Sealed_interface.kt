fun main(){
  val circle1 = circle(r = 5f)
  val rect1 = rectangle(width = 15F, height = 10F)
  val rect2 = rect1.copy()

  rect1.hello()   // calling the function in an interface without overriding it
  println(printshapes(rect1, rect2, circle1))

}

    // Day 5 Sealed Interface 😊
sealed interface shape {   // interface is the contract for classes / and is we used the sealed keyword before the interface then it will not allow the interface to be implemented outside out package
    val area : Float
    val circumference : Float

        fun hello(){
            println("hello")
        }
}

data class rectangle(val width: Float, val height: Float): shape{  // Implement the shape abstract with shape() // need to use () while extending abstract class

    val w = width
    val h = height
    val diagonal = sqrt(w * w + h * h)
    override val area: Float = w * h   // overriding the function of the interface
    override val circumference: Float = 2 * (w +h)



    fun issquare(): Boolean {
        return w == h
    }
}


data class circle(val r :Float): shape{
    override val area: Float = r * r * PI.toFloat()
    override val circumference: Float = 2 * r * PI.toFloat()

}


fun printshapes(vararg shapes : shape) {
    for (shape in shapes){
        val output = when(shape){
            is rectangle -> "This is a rectangle"
            is circle -> "This is a circle"
            else -> null    // no need if we have sealed interface
        }
//        if (shape is rectangle) println("This is a rectangle")    // we can also do this like this rather than using when
//        if (shape is circle) println("This is a circle")      // we can also do this like this rather than using when
    }
}
