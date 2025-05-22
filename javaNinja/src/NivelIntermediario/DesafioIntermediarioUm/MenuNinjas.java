package NivelIntermediario.DesafioIntermediarioUm;

import java.util.Scanner;

public class MenuNinjas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int MAX_NINJA = 10;
    Ninja[] ninjas = new Ninja[MAX_NINJA];
    int count = 0;

    while (true) {
      System.out.println("\n--- MENU ---");
      System.out.println("1. Exibir todos os ninjas");
      System.out.println("2. Adicionar novo ninja");
      System.out.println("3. Atualizar habilidade especial (Uchiha)");
      System.out.println("0. Sair");
      System.out.print("Escolha uma opção: ");
      int opcao = scanner.nextInt();
      scanner.nextLine();  // limpar o buffer

      switch (opcao) {
        case 1:
          for (int i = 0; i < count; i++) {
            System.out.println("\nNinja #" + i);
            if (ninjas[i] instanceof Uchiha) {
              ((Uchiha) ninjas[i]).showAllInfo();
            } else {
              ninjas[i].showInformation();
            }
          }
          break;

        case 2:
          if (count >= MAX_NINJA) {
            System.out.println("Limite máximo de ninjas atingido!");
            break;
          }

          System.out.print("Esse ninja é Uchiha? (s/n): ");
          String tipo = scanner.nextLine();

          System.out.print("Nome: ");
          String nome = scanner.nextLine();

          System.out.print("Idade: ");
          int idade = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Missão: ");
          String missao = scanner.nextLine();

          System.out.print("Nível de dificuldade: ");
          String dificuldade = scanner.nextLine();

          System.out.print("Status da missão: ");
          String status = scanner.nextLine();

          if (tipo.equalsIgnoreCase("s")) {
            System.out.print("Habilidade especial: ");
            String habilidade = scanner.nextLine();

            Uchiha novoUchiha = new Uchiha();
            novoUchiha.name = nome;
            novoUchiha.age = idade;
            novoUchiha.quest = missao;
            novoUchiha.dificultLevel = dificuldade;
            novoUchiha.questStatus = status;
            novoUchiha.specialHability = habilidade;

            ninjas[count] = novoUchiha;
          } else {
            Ninja novoNinja = new Ninja();
            novoNinja.name = nome;
            novoNinja.age = idade;
            novoNinja.quest = missao;
            novoNinja.dificultLevel = dificuldade;
            novoNinja.questStatus = status;

            ninjas[count] = novoNinja;
          }
          count++;
          System.out.println("Ninja adicionado com sucesso!");
          break;

        case 3:
          System.out.print("Informe o número do ninja a atualizar: ");
          int index = scanner.nextInt();
          scanner.nextLine();

          if (index >= 0 && index < count && ninjas[index] instanceof Uchiha) {
            System.out.print("Nova habilidade especial: ");
            String novaHab = scanner.nextLine();

            ((Uchiha) ninjas[index]).specialHability = novaHab;
            System.out.println("Habilidade atualizada com sucesso!");
          } else {
            System.out.println("Índice inválido ou ninja não é Uchiha.");
          }
          break;

        case 0:
          System.out.println("Encerrando...");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}
