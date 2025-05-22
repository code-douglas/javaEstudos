package EstruturaDeDados;

import java.util.Scanner;

public class DesafioBasicoDois {
  public static void main(String[] args) {
    Scanner cadastroDeNinjas = new Scanner(System.in);

    int NUMERO_MAX = 10;
    String[] ninjas = new String[NUMERO_MAX];

    int ninjasCadastrados = 0;
    int opcao = 0;

    while(opcao != 4) {
      
      System.out.println("\n ===== Menu Ninja ====");
      System.out.println("1 -  Cadastrar ninjas");
      System.out.println("2 - Listar ninjas");
      System.out.println("3 - Deletar ninjas");
      System.out.println("4 - Sair ");
      System.out.println("Escolha uma opção: ");

      opcao = cadastroDeNinjas.nextInt();
      cadastroDeNinjas.nextLine();

      switch (opcao) {
        case 1:
          if(ninjasCadastrados < NUMERO_MAX) {
            System.out.println("Digite o nome do ninja: ");
            String nomeNinja = cadastroDeNinjas.nextLine();
            ninjas[ninjasCadastrados] = nomeNinja;
            ninjasCadastrados++;
            System.out.println("Ninja cadastrado com sucesso!");
          } else {
            System.out.println("A lista de ninjas está cheia");
          }
          break;
        case 2: 
          if(ninjasCadastrados == 0) {
            System.out.println("Não há ninjas cadastrados no momento");
          } else {
            System.out.println("==== Lista de ninjas ====");
            for (int i = 0; i < ninjas.length; i++) {
              if(ninjas[i] == null) {
                ninjas[i] = "Espaço vazio";
              } else {
                System.out.println(ninjas[i]);
              }
            }
          }
          break;
        case 3:
          System.out.println("Digite o número do ninja para apagar, começando do 0");
          int ninjaParaDeletar = cadastroDeNinjas.nextInt();

          if (ninjaParaDeletar < 0 || ninjaParaDeletar >= ninjas.length) {
            System.out.println("Índice inválido!");
          } else if (ninjas[ninjaParaDeletar] == null) {
            System.out.println("Este ninja não existe.");
          } else {
            ninjas[ninjaParaDeletar] = null;
            System.out.println("Ninja removido com sucesso.");
          }
          break;
        case 4:
          System.out.println("Encerrando o programa.");
          break;
        default:
          System.out.println("Opção invalida;");
          break;
      }
    }
    cadastroDeNinjas.close();
  }
}
