package com.escolasenai.poo.parte1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    public static void menuFinal(){

        int opcaoM = 8;
        do{

                System.out.println("\n- MENU -");
                System.out.println("O que você quer fazer?");
                System.out.println("1- Menu Aluno.");
                System.out.println("2- Menu Professor:");
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");
                Scanner sc = new Scanner(System.in);
            try {
                opcaoM = sc.nextInt();
                System.out.println("\n");
                switch (opcaoM) {

                    case 1:
                        Secretaria.secretariaMenuAluno();
                        break;
                    case 2:
                        Secretaria.secretariaMenuProfessor();
                        break;
                    case 0:
                        System.out.println("Saindo");
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
