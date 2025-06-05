package NivelIntermediario.ReferenciaDeMemoria;

public class Uzumaki extends Ninja {

  public Uzumaki(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  @Override
  public void HabilidadeEspecial() {
    System.out.println("Rasengan");
  }
}
