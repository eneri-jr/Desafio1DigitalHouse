package br.com.digitalHouse

class Curso(var codCurso: Int,
            var nome: String,
            var profTitu: ProfessorTitular,
            var profAdj: ProfessorAdjunto,
            var maxAlun: Int,
            var listaAlun: List<Aluno>
            ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false

        if (codCurso != other.codCurso) return false

        return true
    }
}