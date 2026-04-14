fun main(){
  println(sumareas(rect1, rect2))     // calling the function sumareas to add the area of both objects
}


// DAy 5 Interface 😊
interface shape {   // interface is the contract for classes
    val area : Float
    val circumference : Float
}

fun sumareas(vararg shapes : shape) : Double{   // we needed interface for adding both areas of the objects
    return shapes.sumOf {   // double is used bcz sumOf do not accept float value
        currentShape -> currentShape.area.toDouble()
    }
}

data class rectangle(val width: Float, val height: Float): shape{  // Implement the shape interface

    val w = width
    val h = height
    val diagonal = sqrt(w * w + h * h)  
    override val area: Float = w * h   // overriding the function of the interface and it is compalsory to add into the class 
    override val circumference: Float = 2 * (w +h)  // overriding the function of the interface and it is compalsory to add into the class

}
