package br.com.digitalHouse

abstract class Professor(override var nome: String, override var sobrenome: String, var codProfessor: Int, var tempoCasa: Int) : Pessoa {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        if (codProfessor != other.codProfessor) return false

        return true
    }
}