fun main(){
  
    // Day 2 Array , Loops , list 😊

    // Array    😊
    print("Enter the index of number: ")
    val input = readln()
    val inputasint = input.toIntOrNull()
    val arr = intArrayOf(1,2,3,4)

//    println(arr.getOrNull(3))   // pointer 3
//    println(arr.getOrNull(5))   // pointer 5 which not exists so gives error

    if (inputasint != null && inputasint in arr.indices) { // we can also put < arr.size but when we use it with "in" then it automatically takes it as <= so that if we put even 4 will take it
        println("Your Number is ${arr[inputasint]}.") // 0..arr.lastIndex
    }
    else{
        println("Your Number is out of range.")
    }


    // loops    😊

    print("enter a number : ")
    val n1 = readln().toInt()

    val arr2 = IntArray(n1)  // we use IntArray for using dynamic size given by user
    var i1 = 0
    while (i1 < n1) {   // n!! means i'm sure that the n is not null and if its null then the app will give error
        print("Valur at $i1 : ")
        val number = readln().toIntOrNull() ?: 0
        arr2[i1] = number
        i1++
    }
    for (i in arr2.indices) {
        print("Array is : ${arr2[i]} ")
    }



    // for array without giving size    😊
    print("enter a number : ")
    val n2 = readln().toInt()

    var arr4 = intArrayOf() // like this we can also declare the array and not provide the size of it
    var i2 = 0
    while (i2 < n2) {   // n!! means i'm sure that the n is not null and if its null then the app will give error
        print("Enter value at $i2 : ")
        val number = readln().toIntOrNull() ?: continue
        arr4 += number
        i2++
    }

    println("Array is ${arr4.contentToString()}")




    // Sum of numbers but without array 😊

    print("how many numbers do you want to enter? : ")
    val num = readln().toIntOrNull() ?: 0 // if user enter do not enter a valid number then it takes 0 as default number

    var sum = 0
    var j = 0
    while (j < num) {
        print("Please Enter Number no ${j+1} : ")
        val number = readln().toIntOrNull() ?: continue // if user do not enter a valid number then it skip the program below this and moves again to the loop so the increment is below the continue so that does not execute that's how the program asks for the same number no again
        sum += number
        j++
    }
    println("Sum is : $sum")




    // list                 😊
    print("enter a number : ")
    val n = readln().toInt()

    val list1 = mutableListOf<Int>() // declaration of list with its type
//    var i = 0
//    while (i < n) {   // n!! means i'm sure that the n is not null and if its null then the app will give error
//        print(" Enter value at $i : ")
//        val number = readln().toIntOrNull() ?: continue
//        list1.add(number) // used to add/append new word to the list
//        i++
//    }

    for (i in 0 until n){   // we can also use for loop for this, and we are using "until" here so that the iteration is upto the size - 1
        print("Enter value at $i : ")
        val number = readln().toIntOrNull() ?: 0    // if valid input otherwise 0 will be assigned
        list1.add(number) // used to add/append new word to the list
    }

//    for (i in list1){     // we can also print the numbers like this
//        print("$i ")
//    }

//    for (i in list1.lastIndex downTo 0){  // we can reverse the list and print
//        print("${list1[i]} ")
//    }
    println("Array is $list1")
}
