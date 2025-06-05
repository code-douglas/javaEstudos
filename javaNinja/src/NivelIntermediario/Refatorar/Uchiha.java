package NivelIntermediario.Refatorar;

public class Uchiha extends Ninja {

  public Uchiha(String nome, int idade, double altura, String aldeia) {
    super(nome, idade, altura, aldeia);
  }

  @Override
  public void HabilidadeEspecial() {
    System.out.println("Amaterasu");
  }
}
