package NivelIntermediario.ClassesAbstratasinterfaces;

public abstract class Ninja {
  String nome;
  int idade;
  String aldeia;

  public abstract void saudacao();
  public void jogarKunai() {
    System.out.println("Joguei uma Kunai");
  }
}
