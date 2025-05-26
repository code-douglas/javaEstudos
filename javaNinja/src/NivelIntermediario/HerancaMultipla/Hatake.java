package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface {

  // Método que vem direto da interface;
  public void AtivarSharingan() {
    System.out.println("O Uchiha puro: " + nome + " ativou o Sharingan");
  }

  public void saudacao() {
    System.out.println("Seja bem vindo ao clã Hatake");
  }
}
