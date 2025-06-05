package NivelIntermediario.ReferenciaDeMemoria;

public class Uchiha extends Ninja {

  public Uchiha(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  @Override
  public void HabilidadeEspecial() {
    System.out.println("Amaterasu");
  }
}
