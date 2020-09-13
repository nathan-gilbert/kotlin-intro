// based off an example from 'Kotlin in Action'
data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"), Person("Bob", 30))

    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is $oldest")
}
