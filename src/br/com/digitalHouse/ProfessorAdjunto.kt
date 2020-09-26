package br.com.digitalHouse

class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       codProfessor: Int,
                       tempoCasa: Int,
                       var quantHoras: Int) : Professor(nome, sobrenome, codProfessor, tempoCasa)