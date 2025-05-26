package NivelIntermediario.SuperClassesSubClasses;

public class Uchiha extends Ninja {

  public Uchiha() {
    super();
  }

  public Uchiha(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  public void HabilidadeEspecial() {
    System.out.println("Amaterasu");
  }

  public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: " + nome + "E esta é a estrategia de batalha Uchiha");
  }
}
