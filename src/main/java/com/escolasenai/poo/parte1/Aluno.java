package com.escolasenai.poo.parte1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    
    private Date dataMatricula;
    private String curso;
    private Situacao situacao;

    public static List<Aluno> alunosList = new ArrayList<Aluno>();

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
    public static void registrarAluno(){
        System.out.println(" -- Registrar novo aluno -- ");
        System.out.println("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        Aluno.alunosList.add(aluno);
    }


    public static void atualizarAluno(){
        if (!Aluno.alunosList.isEmpty()) {

            System.out.println("Listar alunos: ");
            listarAlunos();
            System.out.println("Digite o número do aluno para atualização: ");
            Scanner sc = new Scanner(System.in);
            int alunoIndex = sc.nextInt() - 1;
            if (alunoIndex >= 0 && alunoIndex < Aluno.alunosList.size()) {
                Aluno alunoToUpdate = Aluno.alunosList.get(alunoIndex);
                System.out.println("Coloque o novo nome: ");
                sc.nextLine();
                String newNome = sc.nextLine();
                alunoToUpdate.setNome(newNome);
                System.out.println("Aluno atualizado com sucesso. \n");
            } else {
                System.out.println("Número de estudante inválido. \n");
            }
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }
    public static void excluirAluno(){
        if (!Aluno.alunosList.isEmpty()) {

            System.out.println("Listar alunos: ");
            listarAlunos();
            System.out.println("Digite o número do aluno para exclusão: ");
            Scanner sc = new Scanner(System.in);
            int alunoIndex = sc.nextInt() - 1;
            if (alunoIndex >= 0 && alunoIndex <= Aluno.alunosList.size()) {
                Aluno.alunosList.remove(alunoIndex);
                System.out.println("Aluno excluido com sucesso. \n");
            } else {
                System.out.println("Número de estudante inválido. \n");
            }
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }

    public static void listarAlunos(){
        if(!Aluno.alunosList.isEmpty()){
            System.out.println("Listar alunos: ");
            for (int i = 0; i< Aluno.alunosList.size(); i++){
                System.out.println((i+1) + "- " + Aluno.alunosList.get(i).getNome());
            }
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }
}







    

   