class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {//alimenta com o funcionário padrão
        this.total += funcionario.bonificacao()//regra de bonificaçao padrão
    }

    fun registra(gerente: Gerente) {//alimenta com o gerente
        this.total += gerente.bonificacao()//regra de bonificaçao gerente
    }

    fun registra(diretor: Diretor) {//alimenta com o diretor
        this.total += diretor.bonificacao()//regra de bonificaçao diretor
    }
}