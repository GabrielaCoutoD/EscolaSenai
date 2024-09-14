package com.escolasenai.poo.parte1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private static Situacao situacao;
    private static String ususarioLogado = null;
    private static String funcaoUsuario = null;

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Bem vindo ao sistema, entre com seu login --");
        System.out.println("Email: ");
        String userEmail = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();

        boolean usuarioValido = false;

        for(Secretaria s : Secretaria.getSecretaria()) {
            if (userEmail.equals(s.getEmail()) && senha.equals(s.getSenha())) {
                ususarioLogado = userEmail;
                funcaoUsuario = "Secretaria";
                System.out.println("Login realizado com sucesso. (Secretaria)!");
                usuarioValido = true;
            }
        }
        for (Professor p: Professor.getProfessoresList()) {
            if (userEmail.equals(p.getEmail()) && senha.equals(p.getSenha())){
                ususarioLogado = userEmail;
                funcaoUsuario = "Professor";
                System.out.println("Login realizado com sucesso. (Professor)!");
                usuarioValido = true;
            }
        }
        for (Aluno a : Aluno.getAlunosList()) {
            if (userEmail.equals(a.getEmail()) && senha.equals(a.getSenha())) {
                ususarioLogado = userEmail;
                funcaoUsuario = "Aluno";
                System.out.println("Login realizado com sucesso. (Aluno)!");
                usuarioValido = true;
            }
        }
        if (!usuarioValido){
            System.out.println("Email ou senha invpalidos. Por favor tente outra vez");
            login();
        }
    }
        public static void menuFinal(){

            int opcaoM = 8;
            if (ususarioLogado == null){
                System.out.println("Você precisa fazer o login antes.");
                login();
            }
    
        do{

                System.out.println("\n- MENU -");
                System.out.println("O que você quer fazer?");
                if(funcaoUsuario.equals("Secretaria")) {
                    System.out.println("1- Menu Aluno.");
                    System.out.println("2- Menu Professor:");
                }else if (funcaoUsuario.equals("Professor")){
                    System.out.println("1- Imprime boletim");
                    
                } else if (funcaoUsuario.equals("Aluno")) {
                    System.out.println("1- Meu boletim");
                }
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");
                Scanner sc = new Scanner(System.in);

                try {
                opcaoM = sc.nextInt();
                System.out.println("\n");
                switch (opcaoM) {

                    case 1:
                    if (funcaoUsuario.equals("Secretaria")) {
                        Secretaria.secretariaMenuAluno();
                    }else if (funcaoUsuario.equals("Professor")){
                        System.out.println("O boletim foi impresso");
                    }else if (funcaoUsuario.equals("Aluno")){
                        System.out.println("Boletim impresso");
                    }
                    break;
                    case 2:
                            if (funcaoUsuario.equals("Secretaria")) {
                                Secretaria.secretariaMenuProfessor();
                            }else if (funcaoUsuario.equals("Professor")){
                                System.out.println("Lançar notas: ");
                            }
                            break;
                    case 0:
                        System.out.println("Saindo");
                        funcaoUsuario = null;
                        ususarioLogado = null;
                        break;
                    default:
                        System.out.println("Opção Inválida.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Por favor digite um número inteiro!");
            }
        }while(opcaoM != 0);
                
        }
    }