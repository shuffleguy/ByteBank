fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "123.122.546-66",
        salario = 1000.0,
        )
    println("nome ${alex.nome}")
    println("nome ${alex.cpf}")
    println("nome ${alex.salario}")
    println("Bonificaão ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "123.555.765-12",
        salario = 4000.0,
        senha = 123,
    )

    println("nome ${fran.nome}")
    println("nome ${fran.cpf}")
    println("nome ${fran.salario}")
    println("Bonificaão ${fran.bonificacao()}")


    if (fran.autentica(123)) {
        println("autorizada")

    } else {
        println("naõ autorizada")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "434.655.123-11",
        salario = 4000.0,
        senha = 133,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("nome ${gui.cpf}")
    println("nome ${gui.salario}")
    println("nome ${gui.plr}")
    println("Bonificaão ${gui.bonificacao()}")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println(calculadora.total)
}
