package br.com.dh.exc1

class Cliente(nome: String, sobrenome: String) {
    //attr
    private var nome: String = ""
    private var sobrenome: String = ""

    //init
    init {
        this.setNome(nome)
        this.setSobrenome(sobrenome)
    }

    //get set
    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome: String) {
        this.nome = nome
    }

    fun getSobrenome(): String {
        return this.sobrenome
    }

    fun setSobrenome(sobrenome: String) {
        this.sobrenome = sobrenome
    }
}