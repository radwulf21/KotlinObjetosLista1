package br.com.dh.exc4

class Tripe(var alturaMinima: Float, var alturaMaxima: Float) {

    private var dobrado = true
    private var alturaAtual = this.alturaMinima

    fun definirAltura(novaAltura: Float) {
        if (novaAltura >= this.alturaMinima && novaAltura <= alturaMaxima) {
            this.alturaAtual = novaAltura
            println("Nova altura de ${this.alturaAtual} cm definida!")
        } else {
            println("Altura não suportada!")
        }
    }

    fun dobrar() {
        if (this.dobrado) {
            println("O tripé já está dobrado!")
        } else {
            this.dobrado = true
            println("Dobrando tripé...")
        }
    }

    fun desdobrar() {
        if (!this.dobrado) {
            println("O tripé já está desdobrado!")
        } else {
            this.dobrado = false
            println("Desdobrando tripé...")
        }
    }

    fun guardar() {
        this.dobrado = true
        this.alturaAtual = this.alturaMinima
        println("O tripé está dobrado e na altura mínima!")
    }

    fun prontoParaGuardar() {
        if (this.dobrado && this.alturaAtual == this.alturaMinima) {
            println("Tripé pronto para guardar!")
        } else {
            println("O tripé não está pronto para guardar!")
        }
    }

    fun usar() {
        this.dobrado = false
        this.alturaAtual = (this.alturaMaxima / 2) + 10
        println("O tripé está desdobrado e na altura certa!")
    }

    fun prontoParaUsar() {
        if (!this.dobrado && this.alturaAtual > (this.alturaMaxima / 2) && this.alturaAtual <= this.alturaMaxima) {
            println("Tripé pronto para usar!")
        } else {
            println("O tripé não está pronto para usar!")
        }
    }
}