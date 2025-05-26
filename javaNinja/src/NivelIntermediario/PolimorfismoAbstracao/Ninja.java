package NivelIntermediario.PolimorfismoAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {
  String nome;
  int idade;
  String aldeia;

  public void HabilidadeEspecial() {
    System.out.println("Joguei uma Kunai");
  }
  
  @Override
  public void estrategiaDeBatalhaNinja() {
    System.out.println("Está é minha estrategia de combate.");
  }
}
