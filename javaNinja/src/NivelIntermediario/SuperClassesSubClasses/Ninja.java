package NivelIntermediario.SuperClassesSubClasses;

public abstract class Ninja implements EstrategiaDeBatalha {
  String nome;
  int idade;  
  String aldeia;

  public Ninja(String nome, int idade, String aldeia) {
    this.nome = nome;
    this.idade = idade;
    this.aldeia = aldeia;
  }

  public Ninja() {
  }

  public void HabilidadeEspecial() {
    System.out.println("Joguei uma Kunai");
  }
  
  @Override
  public void estrategiaDeBatalhaNinja() {
    System.out.println("Está é minha estrategia de combate.");
  }
}
