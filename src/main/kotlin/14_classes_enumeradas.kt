fun main() {
    var valor1 = enumerada.VALOR1
    println(valor1)

    var valor2 = enumeradaComConstrutor.VALOR2
    println(valor2.label)
}

enum class enumerada {
    VALOR1,
    VALOR2,
    VALOR3,
    VALOR4
}

// PODEMOS CRIAR CONSTRUTORES PARA CLASSES ENUMERADAS
enum class enumeradaComConstrutor(val label: String) {
    VALOR1("Valor1"),
    VALOR2("Valor2"),
    VALOR3("Valor3"),
    VALOR4("Valor4")
}