package main.kotlin.bytebank.Modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticar {

    override fun autentica(senha: Int): Boolean {
        println("aaaa")
        if(this.senha == senha){
            return true
        }
        return false
    }
}