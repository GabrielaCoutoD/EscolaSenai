package com.escolasenai.poo.parte1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    
    private List<Nota> notasList = new ArrayList<>();

    public List<Nota> getNotasList(){
        return notasList;
    }

    public void addNota(Nota nota){
        this.notasList.add(nota);
    }

    public static List<Disciplina> disciplinasList = new ArrayList<Disciplina>();

    public Disciplina getDisciplinaByNome(String nomeDisciplina) {
        for (Disciplina disciplina : disciplinasList){
            if(disciplina.getNomeDisciplina().equals(nomeDisciplina)){
                return disciplina;
            }
        }
        return null;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public static List<Disciplina> getDisciplinasList(){
        return disciplinasList;
    }

    public static void showDisciplinasList(){
        if(!Disciplina.disciplinasList.isEmpty()){
            System.out.println("Lista de disciplinas: ");
            for (Disciplina d : disciplinasList){
                System.out.println((disciplinasList.indexOf(d))+ "- " + d.getNomeDisciplina());
            }
        }else {
            System.out.println("Não há nenhuma disciplina resgistrada. \n");
        }
    }


    public static void alimentarDisciplina(){
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNomeDisciplina("JAVA");
        disciplinasList.add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNomeDisciplina("LOGIC");
        disciplinasList.add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNomeDisciplina("DBA");
        disciplinasList.add(disciplina3);
    }
}




    

    