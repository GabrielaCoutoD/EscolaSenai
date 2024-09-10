package com.escolasenai.poo.parte1;

public class Notas {

    private int notas;
    private Aluno aluno;
    private Disciplina disciplina;

    public Notas(int notas, Aluno aluno, Disciplina disciplina) {
        this.notas = notas;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    


}




    

   