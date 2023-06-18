fun main() {

    val nome = "Vítor Mancini Rodrigues"
    var idade = 28
    var peso = 103.4

    print("Meu nome é : " + nome)
    print("\nMinha idade é : " + idade)

    // VARIÁVEIS DO TIPO val NÃO PODEM SER ALTERADAS (IMUTÁVEIS)
    // VARIÁVEIS DO TIPO var PODEM SER ALTERADAS
    // PODEMOS VERIFICAR O TIPO DE UMA VARIÁCEL ATRAVÉS DO ::class

    print("\n\nTipo da variável nome: " + nome::class)
    print("\nTipo da variável idade: " + idade::class)
    print("\nTipo da variável peso: " + peso::class)

    // PODEMOS ESPECIFICAR O TIPO DAS VARIÁVEIS

    var produto: String = "Computador"
    var preco: Double = 1999.99
    var desconto: Float = 10.90f
    var quantidade: Int = 10
    var condicao: Boolean = true
    var letra: Char = 'v'

    // CONVERSÃO DE TIPOS

    var mediaPreco: Int = 22
    print("\n\nVariável mediaPreco convertida para Double: " + mediaPreco.toDouble())

    var variavelFloat: Float = 19.99f
    print("\nConvertendo de Float para Int perdemos as casas decimais: " + variavelFloat.toInt())

    var variavelNumerica: Double = 22.5
    print("\nConvertendo variável numérica para String: " + variavelNumerica.toString())
}