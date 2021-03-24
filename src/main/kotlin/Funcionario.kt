abstract class Funcionario(// abrir classe
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    abstract fun bonificacao(): Double // abrir função

    //open fun bonificacao: Double get() = salario * 0.1 função pode ser escrita assim

    //open val bonificacao: Double get() = salario * 0.1 pode ser uma propriert
}
