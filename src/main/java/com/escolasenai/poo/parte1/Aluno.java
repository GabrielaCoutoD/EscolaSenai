package com.escolasenai.poo.parte1;

public class Aluno extends Pessoa {
    private String dataMatricula;
    private String curso;
    private Notas notas;


    public Aluno(int resgitro, String cpf, String nome, String dataNascimento, Endereco endereco, String telefone,
                String email, String senha, String curso, String dataMatricula, Notas notas){

        super(resgitro, cpf, nome, dataNascimento, endereco, telefone, email, senha);
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.notas = notas;
    }


    public String getDataMatricula() {
        return dataMatricula;
    }


    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public Notas getNotas() {
        return notas;
    }


    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    


    

}









    

   