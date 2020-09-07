package br.com.dh.exc1

class Conta(numConta: Int, saldo: Double, titular: Cliente) {
    //attr
    private var numConta: Int = 0
    private var saldo: Double = 0.0
    private lateinit var titular: Cliente

    //init
    init {
        this.setNumConta(numConta)
        this.setSaldo(saldo)
        this.setTitular(titular)
    }

    //met
    fun deposito(quantia: Double) {
        println("Tipo de Transação: Depósito")
        this.saldo += quantia
        println("Novo Saldo: R$ ${this.saldo}")
    }

    fun saque(quantia: Double) {
        if (quantia > saldo) {
            println("Saldo Insuficiente")
        } else {
            println("Tipo de Transação: Saque")
            this.saldo -= quantia
            println("Novo Saldo: R$ ${this.saldo}")
        }
    }

    //get set
    fun getNumConta(): Int {
        return this.numConta
    }

    fun setNumConta(numConta: Int) {
        this.numConta = numConta
    }

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

    fun getTitular(): Cliente {
        return this.titular
    }

    fun setTitular(titular: Cliente) {
        this.titular = titular
    }
}