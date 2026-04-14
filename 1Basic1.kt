// fun main() {
//     val name = "Kotlin" // we do declare variable using val or var ( val cannot be changed later while var can be changed)

//     println("Hello, " + name + "!") // To print something we use println() or print()

//     var x: Float = 9.0f //declaring data type is also optional if you are not providing .00 then it will consider it as INT so put a "f" after number so compiler can understand its a float 
//     val y = 10F 	// Like this you can also declare a float 
//     println(x/y)
//     x = 5f		// Here we can see that only var value can be changed later
//     print(x/y)

//     print("Enter a number: ")
//     val input = readln()	// to take input we use readln()
//     val inputasint = input.toIntOrNull()?.rem(2)?.equals(0)   	// This firstly check the input can we transformed into integer or not if yes then transfer if not then it gives null to the variable then if this comes true which means the intput is transferred into integer then it checks its reminder is equals to 0 or not 
//     println("is even ? $inputasint")

// }

fun main(){
    print("Enter a number: ")
    val input = readln()
    val inputasint = input.toIntOrNull()
    println("is even ? $inputasint")

    val output = when (inputasint) {	// we can also skip the val output declaration // when is like if else
        null -> {			// we can also use brakets to assign something 
            println("Please enter a valid number")
        }
        3 -> "the number is 3"		// and we can also assign something directly
        5 -> "the number is 5"
        in 10..20 -> "the number is between 10 and 20"	// this checks if the number is between 10 - 20 // the code checks everything line by line so if something is matched then its terminated there
        //(inputasint % 2 == 0) -> "the number is even" // refer to line 49
        else -> "the number is odd "
    }

    // val number = 5
    // val result = if (number % 2 == 0){
    //     "Even"
    // }else if (number == null){               // Example of if-elseif-else with assigning value to result
    //     "Value is null"
    // }
    // else{
    //     "odd"
    // }
    // println(result)


}
//val output = when {   // we can also do this like that because when we use the upper one then we cannot check if (inoutasint % 2 == 0)
//        inputasint == null -> "Please enter a valid number"
//        inputasint == 3 -> "the number is 3"
//        inputasint == 5 -> "the number is 5"
//        inputasint in 10..20 -> "the number is between 10 and 20"
//        inputasint % 2 == 0 -> "the number is even"
//        else -> "I have no idea what to print"
//    }
