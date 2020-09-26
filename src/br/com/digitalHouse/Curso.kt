package br.com.digitalHouse

class Curso(var codCurso: Int,
            var nome: String,
            var profTitu: ProfessorTitular,
            var profAdj: ProfessorAdjunto,
            var maxAlun: Int,
            var listaAlun: MutableList<Aluno>
            ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false

        if (codCurso != other.codCurso) return false

        return true
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if(listaAlun.size >= maxAlun) return false
        listaAlun.forEach{if(it.equals(umAluno)) return false}

        listaAlun.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlun.forEach{if(it.equals(umAluno)) listaAlun.remove(it)}
    }
}