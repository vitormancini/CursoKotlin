import java.lang.NumberFormatException

fun main() {
    // CAUSANDO UMA EXCEPTION NO CÓDIGO
    divide("xx", "5")
    divide("10", "0")
}

fun divide(n1: String, n2: String) {
    try {
        val x = Integer.parseInt(n1)
        val y = Integer.parseInt(n2)
        println(x / y)
    }
    catch(e: NumberFormatException) {
        println("Envie apenas números para a função")
    }
    catch(e: ArithmeticException) {
        println("Divisão por 0 não é permitida")
    }
    catch(e: Exception) {
        println("Um erro genérico ocorreu: ${e.message}")
    }
}