fun main(){

    // day 4 class and data class
    val rect1 = rectangle(width = 15F, height = 10F)

//    println("Width is: ${rect1.w}")
//    println("Height is : ${rect1.h}")
//    println("Diagonal of the rectangle is : ${rect1.diagonal}. The area is ${rect1.area}")

    val rect2 = rect1.copy()
    val rect3 = rect2.copy( // we can also change the properties for rect3 by overriding it
        width = 10F
    )

//    println("Width is: ${rect2.w}")
//    println("Height is : ${rect2.h}")
//    println("Diagonal of the rectangle is : ${rect2.diagonal}. The area is ${rect2.area}")

//    val max = maxarea(rect1, rect2)
//    println(max)

    println("rect1 is sqare? : " + rect1.issquare())
    println("rect2 is sqare? : " + rect2.issquare())
    println("rect3 is sqare? : " + rect3.issquare())

    println("Are both objects has same parameters: " + (rect1 == rect2))    // will give true now as it compare the parameter (bcz we are using data class)
    println(rect1)  // this will give us a answer like : rectangle(width=15.0, height=10.0) and if this done with a normal class then it will print the location of that object
    println(rect2)
    println(rect3)
}


data class rectangle(val width: Float, val height: Float){  // we need to add val infront of parameters in data classes

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
