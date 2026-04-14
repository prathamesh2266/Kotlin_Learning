fun main(){

    // day 4 class and data class
    val rect1 = rectangle(width = 15F, height = 10F)  // Object one created

    println("Width is: ${rect1.w}")
    println("Height is : ${rect1.h}")
    println("Diagonal of the rectangle is : ${rect1.diagonal}. The area is ${rect1.area}")

    val rect2 = rectangle(width = 10F, height = 17F)  // Object two created

    println("Width is: ${rect2.w}")
    println("Height is : ${rect2.h}")
    println("Diagonal of the rectangle is : ${rect2.diagonal}. The area is ${rect2.area}")

    val max = maxarea(rect1, rect2)  // fuction called
    println(max)

    println("rect1 is sqare? : " + rect1.issquare())  // calling a function from the class using a object
    println("rect2 is sqare? : " + rect2.issquare())

    println("Are both objects has same parameters: " + (rect1 == rect2))    // will give false as it compare if the both objects are same not the parameter (bcz we are using normal class not data class)
}


class rectangle(width: Float, height: Float){

    val w = width
    val h = height
    val diagonal = sqrt(w * w + h * h)
    val area = w * h

    fun issquare(): Boolean {
          return w == h
      }
}

fun maxarea(rect1: rectangle, rect2: rectangle): Float {
    val area1 = rect1.area
    val area2 = rect2.area
    val result = maxOf(area1, area2)
    return result

}
