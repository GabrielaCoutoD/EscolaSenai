package com.escolasenai.poo.parte1;

public abstract class Pessoa { // abstract porque é uma classe "pai"

    //Atributos da classe pai
    private int registro;
    private String cpf;
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(int registro, String cpf, String nome, String dataNascimento, Endereco endereco, String telefone,
                String email, String senha){

        this.registro = registro;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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
        this.senha = senha;
    }

}

    