fun main() {
    // QUANTIDADE DE LETRAS DE UMA STRING

    var nome = "Vitor"
    print("O nome Vitor possui " + nome.length + " letras")

    // CONVERTENDO PALAVRA PARA MAIÚSCULA E MINÚSCULA

    print("\nNome maiúsculo: " + nome.uppercase())
    print("\nNome minúsculo: " + nome.lowercase())

    // FORMATAÇÃO DE TEXTOS

    val mensagem = """
        Olá Vitor,
        sua encomenda chegou!
    """.trimIndent()

    print("\n\n" + mensagem)

    var idade: Int = 28
    print("\n\nMeu nome é $nome e tenho $idade anos de idade")
}