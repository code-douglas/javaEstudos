package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("4 - Sair");

        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Saindo...");
        }

        scanner.close();

    }
}
