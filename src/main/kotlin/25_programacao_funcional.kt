fun main() {
    // ENVIANDO FUNÇÕES COMO PARÂMETRO PARA OUTRAS FUNÇÕES
    calculator(5, 4, ::sum)
    calculator(10, 2, ::sub)
    calculator(10, 2, ::mult)
    calculator(8, 4, ::div)
}

fun calculator(x: Int, y: Int, operation: (Int, Int) -> Int) {
    val result = operation(x, y)
    println("Resultado da operação: $result")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sub(x: Int, y: Int): Int {
    return x - y
}

fun mult(x: Int, y: Int): Int {
    return x * y
}

fun div(x: Int, y: Int): Int {
    return x / y
}