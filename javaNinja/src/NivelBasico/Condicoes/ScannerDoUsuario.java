package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        // Scanner é uma forma de trazer o usuário para dentro da aplicação.
        // Objetivo: Usuario criar um ninja e nós iremos validar os dados enviados.

        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome do ninja;
        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();

        // Receba a idade do ninja;
        System.out.println("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();

        // Imprime informações do ninja;
        System.out.println("A idade do ninja é: " + idadeDoNinja);
        System.out.println("===================================");
        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("===================================");

        if(idadeDoNinja >= 18) {
            System.out.println("O ninja " + nomeDoNinja + " é maior de idade ");
        } else {
            System.out.println("O ninja " + nomeDoNinja + " é menor de idade ");
        }

        // Scanner fechado;
        caixaDeTexto.close();
    }
}
