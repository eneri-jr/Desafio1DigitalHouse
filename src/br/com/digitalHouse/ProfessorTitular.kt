package br.com.digitalHouse

class ProfessorTitular(nome: String,
                       sobrenome: String,
                       codProfessor: Int,
                       tempoCasa: Int,
                       var especialidade: String) : Professor(nome, sobrenome, codProfessor, tempoCasa)