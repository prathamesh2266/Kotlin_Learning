// 1. Generic class (invariant by default)
class Box<T>(var value: T)

// 2. Multiple type parameters
class PairHolder<K, V>(val key: K, val value: V)

// 3. Type constraint
fun <T : Number> addNumbers(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

// 4. Covariance (out) - Producer
class Producer<out T>(private val item: T) {
    fun produce(): T = item
}

// 5. Contravariance (in) - Consumer
class Consumer<in T> {
    fun consume(item: T) {
        println("Consumed: $item")
    }
}

// 6. Generic function
fun <T> printItem(item: T) {
    println("Item: $item")
}

// 7. Star projection
fun printUnknownList(list: List<*>) {
    for (item in list) {
        println("Unknown item: $item")
    }
}

// 8. Reified type (inline function)
inline fun <reified T> checkType(value: Any) {
    if (value is T) {
        println("Value matches type ${T::class.simpleName}")
    } else {
        println("Value does NOT match type ${T::class.simpleName}")
    }
}

// ---- MAIN FUNCTION ----
fun main() {

    // Generic class usage
    val intBox = Box(10)
    val stringBox = Box("Hello")

    println(intBox.value)
    println(stringBox.value)

    // Multiple types
    val pair = PairHolder("Age", 25)
    println("${pair.key} = ${pair.value}")

    // Type constraint
    println("Sum: ${addNumbers(5, 10)}")

    // Variance usage
    val producer: Producer<Int> = Producer(100)
    val numberProducer: Producer<Number> = producer  // Covariance works
    println("Produced: ${numberProducer.produce()}")

    val consumer: Consumer<Number> = Consumer()
    val intConsumer: Consumer<Int> = consumer  // Contravariance works
    intConsumer.consume(50)

    // Generic function
    printItem("Kotlin Generics")
    printItem(123)

    // Star projection
    val mixedList: List<Any> = listOf("A", 1, 2.5)
    printUnknownList(mixedList)

    // Reified type check
    checkType<Int>(10)
    checkType<String>(10)
}
