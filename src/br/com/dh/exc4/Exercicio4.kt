package br.com.dh.exc4

class Exercicio4 {

}

fun main() {
    val tripe = Tripe( 45f, 100f)

    tripe.dobrar()
    tripe.desdobrar()

    println("---------------------------------")

    tripe.definirAltura(110f)
    tripe.definirAltura(40f)
    tripe.definirAltura(60f)

    println("---------------------------------")

    tripe.guardar()
    tripe.prontoParaGuardar()

    println("---------------------------------")

    tripe.usar()
    tripe.prontoParaUsar()
}