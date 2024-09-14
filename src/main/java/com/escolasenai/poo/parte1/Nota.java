package com.escolasenai.poo.parte1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nota {

    private int notas;
    private Aluno aluno;
    private Disciplina disciplina;

    public static List<Nota> notasList = new ArrayList<Nota>();

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
    public static List<Nota> getNotasList() {
        return notasList;
    }
    
}




    

   