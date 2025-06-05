package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, Ambu, Hokage {

  // Método que vem direto da interface;
  public void AtivarSharingan() {
    System.out.println(nome + " ativou o Sharingan");
  }

  public void ninjaDeElite() {
    System.out.println("O ninja: " + nome + " Se tornou Ambu");
  }

  public void ninjaHokage() {
    System.out.println("O ninja: " + nome + " Se tornou um hokage");
  }

  public void saudacao() {
    System.out.println("Seja bem vindo ao clã Hatake");
  }
}
