package com.escolasenai.poo.parte1;

import java.util.Date;

public abstract class Pessoa { // abstract porque é uma classe "pai"
    public static int countRegistro = 1001;

    //Atributos da classe pai
    private int registro;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(int registro, String cpf, String nome, Date dataNascimento, Endereco endereco, String telefone,
                String email, String senha){

        this.registro = countRegistro;
        countRegistro++;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    public Pessoa(){
        this.registro = countRegistro;
        countRegistro++;
    }

    public int getRegistro() {
        return registro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf == null || cpf.isEmpty() || !isValidCpf(cpf)){
            System.out.println("Número de CPF inválido");
        }else{
            this.cpf = cpf;
        }
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereço() {
        return endereco;
    }

    public void setEndereço(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha == null || senha.isEmpty() || !isValidSenha(senha)){
            System.out.println("Senha inválida");
        }else{
        this.senha = senha;
        }
    }
    private boolean isValidCpf(String cpf){
        if(cpf.length() != 11){
            return false;
        }else{
            return true;
        }
    }
    private boolean isValidSenha(String senha){
        if(senha.length() < 8){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [registro=" + registro + ", cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento
                + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + "]";
    }

    
}

    