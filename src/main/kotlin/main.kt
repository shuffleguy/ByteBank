fun main() {
    println("Bem vindo ao Bytebank")

    testaComportamentosConta()
    val alex = Funcionario(
        "Alex",
        "083.333.456-12",
        2000.0,

   )
//    val salarioBonifica =alex.salario + alex.bonificacao()

    println("Nome ${alex.nome}")
    println("Cpf ${alex.cpf}")
    println("Salario ${alex.salario}")
    alex.salarioBonifica(
        alex.salario,
        alex.bonificacao()
    )
    val fran = Gerente(
        "Fran",
        "022.323.456-32",
        4000.0,
        senha = 123
    )
    println("Nome ${fran.nome}")
    println("Cpf ${fran.cpf}")
    println("Salario ${fran.salario}")
//    println("Salario com bonificação: ${fran.salario} + ${fran.bonificacao()} =" +
//            "" +  salarioBonifica)
    if (fran.autenticacao(123)){

        println("passou")
    }else{
        println("falhou")
    }

    val gui = Diretor(
        "Guilherme",
        "322.333.657-11",
        4000.0,
        555,
        999
    )
    println("Nome ${gui.nome}")
    println("Cpf ${gui.cpf}")
    println("Salario ${gui.salario}")
    println("Plr ${gui.plr}")
//    println("Salario com bonificação: ${fran.salario} + ${fran.bonificacao()} =" +
//            "" +  salarioBonifica)
    if (gui.autenticacao(999)){

        println("passou")
    }else{
        println("falhou")
    }

}



