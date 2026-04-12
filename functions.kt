fun main(){
   print("Enter a String: ")
    val str = readln()

    val finalstring = reverserstring(stringtoreverse = str) // we can also directly pass the parameter but using the name of parameter while passing makes it clear for compiler when there are multiple parameter

    println("Final String: $finalstring")

    if (str == finalstring) {
        print("It's a Palindrome")
    }

}

// Day 3 // Functions


fun reverserstring(stringtoreverse:String):String {
    val reversedstring = buildString {
        for (i in stringtoreverse.lastIndex downTo 0) {
            append(stringtoreverse[i])
        }
    }
    println( "Reversed String is $reversedstring")
    return reversedstring
}
