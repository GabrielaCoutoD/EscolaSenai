package com.escolasenai.poo.parte1;

import java.util.Date;

public class Professor extends Pessoa  {

    private String dataAdmissao;
    private Double salario;

    public Professor(int registro, String cpf, String nome, Date dataNascimento, Endereco endereco,
                   String telefone, String email, String senha, String dataAdimissao, Double salario) {
        super(registro, cpf, nome, dataNascimento, endereco, telefone, email, senha);
        this.dataAdmissao = dataAdimissao;
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    


}




   
    