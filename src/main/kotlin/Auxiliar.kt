class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario)//herança com labels

{
    override fun bonificacao(): Double {
        return salario * 0.05
    }


}