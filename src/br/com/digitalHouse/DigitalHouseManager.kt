package br.com.digitalHouse

class DigitalHouseManager {

    var listAlun =  mutableListOf<Aluno>()
    var listProf = mutableListOf<Professor>()
    var listCurso = mutableListOf<Curso>()
    var listMatric = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listCurso.add(Curso(codigoCurso, nome, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        listCurso.forEach { if (it.codCurso == codigoCurso) listCurso.remove(it) }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listProf.add(ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listProf.add(ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listProf.forEach { if (it.codProfessor == codigoProfessor) listProf.remove(it) }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        listAlun.add(Aluno(nome, sobrenome,codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
            var curso: Curso = listCurso.find { it.codCurso == codigoCurso }!!
            var aluno: Aluno = listAlun.find { it.codAluno == codigoAluno }!!
        when {
            curso.adicionarUmAluno(aluno) -> {
                listMatric.add(Matricula(aluno, curso))
                curso.listaAlun.add(aluno)
                println("Matricula realizada com sucesso")
            }
            else -> println("Não há mais vagas para este curso")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){

        var curso : Curso = listCurso.find{it.codCurso == codigoCurso}!!
        curso.profTitu = listProf.find{it.codProfessor == codigoProfessorTitular} as ProfessorTitular
        curso.profAdj = listProf.find { it.codProfessor == codigoProfessorAdjunto } as ProfessorAdjunto
    }
}