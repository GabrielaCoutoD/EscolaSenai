package com.escolasenai.poo.parte1;

import java.util.Scanner;

public class Secretaria extends Pessoa implements Login {

    @Override
    public boolean acessAllowed(String email, String senha) {
        if (email.equals(getEmail()) && senha.equals(getSenha())){
            return true;
        }else {
            return false;
        }
    }

    public static void secretariaMenuAluno(){
        int opcoesA;

        do{
            System.out.println("\n- MENU -");
            System.out.println("O que você quer fazer?");
            System.out.println("1- Registrar novo aluno");
            System.out.println("2- Atualizar aluno");
            System.out.println("3- Excluir aluno");
            System.out.println("4- Listar alunos");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            Scanner sc = new Scanner(System.in);
            opcoesA = sc.nextInt();
            System.out.println("\n");
            switch(opcoesA){
                case 1:
                    Aluno.registrarAluno();
                    break;
                case 2:
                    Aluno.atualizarAluno();
                    break;
                case 3:
                    Aluno.excluirAluno();
                    break;
                case 4:
                    Aluno.listarAlunos();
                    break;
                case 0:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }while(opcoesA != 0);
    }

    public static void secretariaMenuProfessor(){
        int opcoesP;

        do{
            System.out.println("\n- MENU -");
            System.out.println("O que você quer fazer?");
            System.out.println("1- Registrar novo professor");
            System.out.println("2- Atualizar professor");
            System.out.println("3- Excluir professor");
            System.out.println("4- Listar professores");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            Scanner sc = new Scanner(System.in);
            opcoesP = sc.nextInt();
            System.out.println("\n");
            switch(opcoesP){
                case 1:
                    Professor.registrarProfessor();
                    break;
                case 2:
                    Professor.atualizarProfessor();
                    break;
                case 3:
                    Professor.excluirProfessor();
                    break;
                case 4:
                    Professor.listarProfessores();
                    break;
                case 0:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }while(opcoesP != 0);
    }
}