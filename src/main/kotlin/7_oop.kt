fun main() {
    // Instanciando a classe Usuario
    var usuario = Usuario()
    usuario.nome = "Vitor"
    usuario.email = "vitor@hotmail.com"
    usuario.admin = true

    println("Nome do usuário: ${usuario.nome}")
    println("Email do usuário: ${usuario.email}")
    println("Usário adm: ${usuario.admin}")

    // Acessando um método da classe
    println(usuario.retornaNomeMaiusculo())
}

class Usuario {
    // Atributos da classe

    var nome: String = ""
    var email: String = ""
    var admin: Boolean = false

    // Método da classe
    fun retornaNomeMaiusculo(): String {
        return this.nome.uppercase()
    }
}
