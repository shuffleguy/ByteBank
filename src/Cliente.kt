class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
): Autenticar
{

    override fun autentica(senha: Int): Boolean {
        println("bbbbb")
        if(this.senha == senha){
            return true
        }
        return false
    }
}
