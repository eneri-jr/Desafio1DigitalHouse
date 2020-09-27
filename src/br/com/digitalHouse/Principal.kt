package br.com.digitalHouse

fun main(){

    val escola = DigitalHouseManager()

    escola.registrarProfessorTitular("Robson", "Cruz", 1,"Java")
    escola.registrarProfessorTitular("Raimundo", "Silva", 2,"FrontEnd")

    escola.registrarProfessorAdjunto("Adamastor", "Leite", 3, 40)
    escola.registrarProfessorAdjunto("Hélio", "Souza", 4, 40)

    escola.registrarCurso("Full Stack",20001 ,3)
    escola.registrarCurso("Android", 20002, 2)

    escola.alocarProfessores(20001, 2, 3)
    escola.alocarProfessores(20002, 1, 4)

    escola.matricularAluno("Amanda", "Carneiro", 1)
    escola.matricularAluno("Roberta", "Costa", 2)
    escola.matricularAluno("Alan", "Gomes", 3)
    escola.matricularAluno("Rafael", "Costa", 4)
    escola.matricularAluno("Daniel", "Lizen", 5)

    escola.matricularAluno(1, 20001)
    escola.matricularAluno(2, 20001)
    escola.matricularAluno(3, 20002)
    escola.matricularAluno(4, 20002)
    escola.matricularAluno(5, 20002)
}