package NivelIntermediario.OverLoadConstrutores;

public class Uchiha extends Ninja {

  public Uchiha() {
    super();
  }

  public Uchiha(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Ranks rank) {
    super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
  }

  public void HabilidadeEspecial() {
    System.out.println("Amaterasu");
  }

  public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: " + nome + "E esta é a estrategia de batalha Uchiha");
  }
}
