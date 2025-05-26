package NivelIntermediario.ClassesAbstratasinterfaces;

public class Uzumaki extends Ninja implements NinjaInterface {

  public void jogarShuriken() {
    System.out.println("Joguei uma shuriken");
  }

  @Override
  public void saudacao() {
    System.out.println("Meu nome é " + nome);
  }
}
