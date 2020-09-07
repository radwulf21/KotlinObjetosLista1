package br.com.dh.exc5

class Exercicio5 {

}

fun main() {
    val concessionaria = Concessionaria()
    val carro = Veiculo("Volkswagen", "Jetta", 2020, "Prata", 0.0)
    val cliente = Cliente("Raul", "Andrade", "raulzin45@gamil.com")
    val venda = Venda(144990.0, carro, cliente)

    concessionaria.registrarVenda(venda)

    concessionaria.registroDeVendas.forEach(::println)
    // ou
    for (venda in concessionaria.registroDeVendas) {
        println(venda)
    }
}