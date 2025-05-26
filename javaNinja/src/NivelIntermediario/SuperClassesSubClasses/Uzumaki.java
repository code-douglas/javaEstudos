package NivelIntermediario.SuperClassesSubClasses;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, int idade, String aldeia) {
      super(nome, idade, aldeia);
    }

    public void HabilidadeEspecial() {
      System.out.println("Rasengan");
    }

    public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: " + nome + " E esta é a estrategia de batalha Uzumaki");
  }
}
