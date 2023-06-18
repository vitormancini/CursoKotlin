fun main() {
    val resultadoSoma = soma(5, 3)
    println("Resultado da função soma: $resultadoSoma")

    val resultadoSubtacao = subtracao(10.9, 7.8)
    println("Resultado da função subtracao: $resultadoSubtacao")
}

fun soma(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun subtracao(n1: Double, n2: Double): Double {
    return n1 - n2
}

// SOBRECARGA DE FUNÇÃO, APESAR DE POSSUIREM A MESMA DECLARAÇÃO, OS PARÂMETROS DIFERENTES AS TORNAM FUNÇÕES DISITNTAS

fun login(usuario: String, senha: String) {
    println("Realizando login como usuario")
}

fun login(usuario: String, senha: String, admin: Boolean) {
    println("Realizando login como administrador")
}