fun main() {
    var name = "Vitor"

    when(name) {
        "Lucas" -> {
            println("Nome Lucas não é o correto")
        }
        "Vitor" -> {
            println("Nome Vitor encontrado")
        }
        "Pedro" -> {
            println("Nome Pedro não é o correto")
        }
        else -> {
            println("Nome não encontrado")
        }
    }

    // RETORNOS ENCURTADOS
    var desconto = when(name) {
        "Vitor" -> "Desconto de 10%"
        "Lucas" -> "Desconto de 20%"
        else -> "Nenhum desconto"
    }

    println(desconto)
}