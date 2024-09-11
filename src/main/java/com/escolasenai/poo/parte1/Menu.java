package com.escolasenai.poo.parte1;

import java.util.Scanner;

public class Menu {

    public static void menuFinal(){

        int opcaoM;

        do{
        System.out.println("\n- MENU -");
        System.out.println("O que você quer fazer?");
        System.out.println("1- Menu aluno.");
        System.out.println("2- Menu professor:");
        System.out.println("0- Sair\n");
        System.out.print("Digite uma opção: ");
        Scanner sc = new Scanner(System.in);
        opcaoM = sc.nextInt();
        System.out.println("\n");
        
        switch(opcaoM){

            case 1:
                Secretaria.secretariaMenuAluno();
                break;
            case 2:
                Secretaria.secretariaMenuProfessor();
                break;
            case 0:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }while(opcaoM != 0);
}
}
