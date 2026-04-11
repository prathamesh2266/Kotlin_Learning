fun main(){
  print("Enter a number: ")
      val input = readln()
      val inputasint =  try{
          input.toIntOrNull()
      } catch (e: NumberFormatException) {    // we can also just put Exception rather than specific NumberFormat Exception to cover all kind of exceptions.
          println("Please enter a valid number !")
          // also we can just put 0 here to skip writing any statements here
      }
      finally {   // this block always execute
          println("You entered Something")
      }
      // we can also throw out own exception using throw ()
      println("is even ? $inputasint")
  
      val output = when (inputasint) {
          null -> {
              println("Please enter a valid number")
          }
          3 -> "the number is 3"
          5 -> "the number is 5"
          in 10..20 -> "the number is between 10 and 20"
  //        (inputasint % 2 == 0) -> "the number is even"
          else -> "i have no idea what to print"
      }
}
