fun main() {
    println(MySingleton.name)
    MySingleton.showMessage()
}


// Day 8 Singletons 😊

object MySingleton {    // object MySingleton defines a class and its single instance at the same time, so you use it directly without creating objects.
    val name = "I am the only instance"
    fun showMessage() {
        println("Hello from singleton!")
    }
}
