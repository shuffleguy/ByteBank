fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "joao",
        cpf = "122.333.444-12",
        salario = 3000.0,
        senha = 111
    )
    val diretor = Diretor(
        nome = "Pedro",
        cpf = "122.333.344-12",
        salario = 3500.0,
        senha = 111,
        plr = 111.0

    )
    val cliente = Cliente(
        nome = "Epaminondas",
        cpf = "111.333.444-23",
        senha = 999
    )

    val login = SIstemaInterno()

    login.entrar(admin = gerente, senha = 111)
    login.entrar(admin =diretor, senha = 111)
    login.entrar(admin = cliente, senha = 999)
}
