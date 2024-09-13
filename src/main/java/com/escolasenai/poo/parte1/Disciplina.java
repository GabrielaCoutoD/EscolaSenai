package com.escolasenai.poo.parte1;

public class Disciplina {

    private String nomeDisciplina;
    private Nota notas;
    private Professor professor;

    public Disciplina(String nomeDisciplina, Nota notas, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = notas;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Nota getNotas() {
        return notas;
    }

    public void setNotas(Nota notas) {
        this.notas = notas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", notas=" + notas + ", professor=" + professor + "]";
    }
      

}




    

    