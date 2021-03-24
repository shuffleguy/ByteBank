class Analista(
    nome: String,
    cpf: String,
    salario: Double,

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario)//herança com labels

{
    override fun bonificacao(): Double {//sobrescrever função
        return salario * 0.1
    }


}