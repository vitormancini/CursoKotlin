fun main() {
    // INICIANDO UM ARRAY DE INTEIROS
    var arrayInteiros = intArrayOf(1, 2, 3, 4, 5)

    // ITERANDO SOBRE O ARRAY (USANDO it)
    arrayInteiros.forEachIndexed { index, element ->
        println("Elemento posição $index = $element")
    }

    // ITERANDO DA MESMA FORMA NUMERANDO A VARIÁVEL
    arrayInteiros.forEach { numero ->
        println(numero)
    }

    // ARRAY DE OBJETOS
    var users = arrayOf(User22("Vitor", 28), User22("Lucas", 27))

    users.forEach {
        println(it.nome)
    }

    // ADICIONAR MAIS UM ELEMENTO NO ARRAY
    users.plus(User22("Maria", 10))
}

class User22(val nome: String, var idade: Int) {

}