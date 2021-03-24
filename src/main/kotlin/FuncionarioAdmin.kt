abstract class FuncionarioAdmin(// abrir classe
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel{//pega herança de funcionário

    //não precisa criar a bonificação por que já é abstrata
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
