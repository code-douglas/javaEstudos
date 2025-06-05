package NivelIntermediario.OverLoadConstrutores;

public class Uzumaki extends Ninja {

  public Uzumaki(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Ranks rank) {
    super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
  }

  public void HabilidadeEspecial() {
    System.out.println("Rasengan");
  }

  public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: " + nome + " E esta é a estrategia de batalha Uzumaki");
  }
}
