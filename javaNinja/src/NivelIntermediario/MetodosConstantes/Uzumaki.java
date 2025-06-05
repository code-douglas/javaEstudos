package NivelIntermediario.MetodosConstantes;

public class Uzumaki extends Ninja {

  public Uzumaki(String nome, int idade, double altura, String aldeia) {
    super(nome, idade, altura, aldeia);
  }

  @Override
  public void HabilidadeEspecial() {
    System.out.println("Rasengan");
  }
}
