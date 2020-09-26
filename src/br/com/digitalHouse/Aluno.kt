package br.com.digitalHouse

class Aluno (override var nome: String, override var sobrenome: String, var codAluno: Int) : Pessoa {

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Aluno) return false

        if(codAluno != other.codAluno) return false

        return true
    }
}