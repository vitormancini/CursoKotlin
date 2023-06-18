fun main() {
    // Podemos definir uma variável como null

    var email: String? = null

    // Se tentarmos acessar uma propriedade dessa string quando for null, o resultado será sempre null

    var qtdCaracteres = email?.length
    println(qtdCaracteres)

    // Operador Elvis: quando uma consição não é correspondida atribuímos um valor padrão

    qtdCaracteres = email?.length ?: 0
    println(qtdCaracteres)
}