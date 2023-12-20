package view;

import java.util.Scanner;

public class Sistema {

    public static void menu(){
        Scanner input;
        input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Cadastrar Ator");
            System.out.println("3 - Cadastrar Diretor");
            System.out.println("4 - Buscar por filme");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Cadastrar Filme");
                    break;
                case 2:
                    System.out.println("Cadastrar Ator");
                    break;
                case 3:
                    System.out.println("Cadastrar Diretor");
                    break;
                case 4:
                    System.out.println("Buscar por filme");
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 5);
    }
}
