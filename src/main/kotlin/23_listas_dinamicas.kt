fun main() {
    // LISTAS SÃO IMUTÁVEIS, PERMITEM APENAS LEITURA

    var listaUsuarios = listOf<User23?>(User23("Vitor", true), User23("Lucas", false))

    // BUSCA O PRIMEIRO E ULTIMO ELEMENTO (CASO NÃO ENCONTRE, RETORNA NULL)
    listaUsuarios.firstOrNull()
    listaUsuarios.lastOrNull()

    // VERIFICA SE UMA LISTA ESTÁ Ou NÃO VAZIA (RETORNA BOOLEANO)
    listaUsuarios.isEmpty()
    listaUsuarios.isNotEmpty()

    // CRIANDO UMA LISTA VAZIA
    var listaVazia = emptyList<User23?>()

}
class User23(var nome: String, var isAdmin: Boolean) {}