package com.escolasenai.poo.parte1;

import java.util.Date;

public class Aluno extends Pessoa {
    
    private Date dataMatricula;
    private String curso;
    private Situacao situacao;


    public Aluno(int registro, String cpf, String nome, Date dataNascimento, Endereco endereco, String telefone,
                String email, String senha, String curso, Date dataMatricula, Situacao situacao){

        super(registro, cpf, nome, dataNascimento, endereco, telefone, email, senha);
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;

    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Situacao getSituacao() {
        return situacao;
    }
    
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno [dataMatricula=" + dataMatricula + ", curso=" + curso + ", situacao="
                + situacao + "]";
    }

}








    

   