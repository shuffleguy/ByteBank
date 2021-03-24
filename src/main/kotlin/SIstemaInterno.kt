class SIstemaInterno {
    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("seja bem vindo")
        }
        else{
            println("Senha incorreta")
        }
    }
}