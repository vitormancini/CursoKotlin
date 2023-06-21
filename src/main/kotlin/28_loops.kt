fun main() {
    var numbers = listOf(10, 9, 8, 7, 6, 5)

    // TRADICIONAL
    for (number in numbers) {
        println(number)
    }

    // COM INDEX
    for (index in 0 until 5) {
        println("Elemento posição $index = ${numbers[index]}")
    }

    // COM STEPS
    for (index in 0 until 5 step 2) {
        println("Elemento posição $index = ${numbers[index]}")
    }

    // DECRESCENTE
    for (index in 5 downTo 0) {
        println("Elemento posição $index = ${numbers[index]}")
    }
}