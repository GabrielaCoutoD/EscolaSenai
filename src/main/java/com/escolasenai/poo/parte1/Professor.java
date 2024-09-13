package com.escolasenai.poo.parte1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa{

    private Date dataAdmissao;
    private Double salario;

    public static List<Professor> professoresList = new ArrayList<Professor>();

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
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
    
    public static void alimentarProfessor(){
        Professor professor1 = new Professor();
        professor1.setNome("Arthur");
        professor1.setSalario(3200.00);
        professor1.setEmail("arthurG@gmail.com");
        professor1.setDataAdmissao(new Date());
        professoresList.add(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("Roni");
        professor2.setSalario(3200.00);
        professor2.setEmail("roni@gmail.com");
        professor2.setDataAdmissao(new Date());
        professoresList.add(professor2);

        Professor professor3 = new Professor();
        professor3.setNome("Andre");
        professor3.setSalario(3200.00);
        professor3.setEmail("andre@gmail.com");
        professor3.setDataAdmissao(new Date());
        professoresList.add(professor3);

        Professor professor4 = new Professor();
        professor4.setNome("Pedro");
        professor4.setSalario(3200.00);
        professor4.setEmail("pedro@gmail.com");
        professor4.setDataAdmissao(new Date());
        professoresList.add(professor4);

    }
    public static List<Professor> getProfessoresList(){
        return professoresList;
    }
}



   
    