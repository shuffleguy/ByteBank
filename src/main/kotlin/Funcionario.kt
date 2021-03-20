open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,

) {
    fun bonificacao(): Double {
        return salario * 0.1
    }

    fun salarioBonifica(
        salario: Double,
        valor: Double,
    ){
        var total = this.salario + this.bonificacao()
        println(total)

    }
}