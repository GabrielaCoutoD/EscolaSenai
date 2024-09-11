package com.escolasenai.poo.parte1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa  {

    private String dataAdmissao;
    private Double salario;

    public static List<Professor> professoresList = new ArrayList<Professor>();

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
    public static void registrarProfessor(){
        System.out.println(" -- Registre um novo professor -- ");
        System.out.println("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Professor professor= new Professor();
        professor.setNome(nome);
        Professor.professoresList.add(professor);
    }

    public static void atualizarProfessor(){
        if (!Professor.professoresList.isEmpty()) {

            System.out.println("Listar professores: ");
            listarProfessores();
            System.out.println("Digite o número do professor para atualizar: ");
            Scanner sc = new Scanner(System.in);
            int professorIndex = sc.nextInt() - 1;
            if (professorIndex >= 0 && professorIndex < Professor.professoresList.size()) {
                Professor professorToUpdate = Professor.professoresList.get(professorIndex);
                System.out.println("Digite o novo nome: ");
                sc.nextLine();
                String newNome = sc.nextLine();
                professorToUpdate.setNome(newNome);
                System.out.println("Professor atualizado com sucesso. \n");
            } else {
                System.out.println("Número de professor inválido. \n");
            }
        }else {
            System.out.println("Não há porfessor registrado.");
        }
    }
    public static void excluirProfessor(){
        if (!Professor.professoresList.isEmpty()) {

            System.out.println("Listar professores: ");
            listarProfessores();
            System.out.println("Digite o número do professor para excluir: ");
            Scanner sc = new Scanner(System.in);
            int professorIndex = sc.nextInt() - 1;
            if (professorIndex >= 0 && professorIndex < Professor.professoresList.size()) {
                Aluno.alunosList.remove(professorIndex);
                System.out.println("Professor excluido com sucesso. \n");
            } else {
                System.out.println("Número de professor inválido. \n");
            }
        }else {
            System.out.println("Não há professor cadastrado.");
        }
    }

    public static void listarProfessores(){
        if(!Professor.professoresList.isEmpty()){
            System.out.println("Listar professores: ");
            for (int i = 0; i< Professor.professoresList.size(); i++){
                System.out.println((i+1) + "- " + Professor.professoresList.get(i).getNome());
            }
        }else {
            System.out.println("Não há professores registrados. \n");
        }
    }
}




   
    