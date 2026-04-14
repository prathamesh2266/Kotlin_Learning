fun main(){
 
    print("Enter a String: ")
        val str2 = readln()
    
        val lettersonly = str2.filter { // Lambda function using a inbuild function
            it.isLetter()
        }
    
        println(lettersonly)
    
        val favnums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evennums = favnums.filter { it % 2 == 0 }   // we can also declare the Lambda function in one line
    
        println(evennums)
    
        val squesrsoffev = favnums.map { it * it } // we can aslo map something 
    
        println(squesrsoffev)
    }
}
