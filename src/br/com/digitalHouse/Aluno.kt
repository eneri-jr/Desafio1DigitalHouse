package br.com.digitalHouse

class Aluno (
        var codAluno: Int,
        var nome : String,
        var sobrenome: String
)
{
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Aluno) return false

        if(codAluno != other.codAluno) return false

        return true
    }
}