package com.escolasenai.poo.parte1;

public class Disciplina {

    private String nomeDisciplina;
    private Notas notas;
    private Professor professor;

    public Disciplina(String nomeDisciplina, Notas notas, Professor professor) {
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

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

}




    

    