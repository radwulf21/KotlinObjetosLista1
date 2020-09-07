package br.com.dh.exc2

class JogadorDeFutebol(nome: String, energia: Int, alegria: Int, gols: Int, experiencia: Int) {
    //attr
    var nome = nome
    var energia = energia
    var alegria = alegria
    var gols = gols
    var experiencia = experiencia

    //met
    fun fazerGol() {
        this.energia -= 5
        this.alegria += 10
        this.gols += 1
        println("GOOOOL!")
    }

    fun correr() {
        this.energia -= 10
        println("Cansei.")
    }

    fun status() {
        println("{nome: " + this.nome +
                ", energia: " + this.energia +
                ", alegria: " + this.alegria +
                ", gols: " + this.gols +
                ", experiencia: " + this.experiencia + "}")
    }
}