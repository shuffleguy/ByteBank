package main.kotlin.bytebank.Modelo

class SistemaInterno {

    fun entra(
        admin: Autenticar,
        senha: Int
    ){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}