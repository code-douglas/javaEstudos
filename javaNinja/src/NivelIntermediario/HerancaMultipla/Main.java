package NivelIntermediario.HerancaMultipla;

public class Main {
  public static void main(String[] args) {
    Uchiha Sasuke = new Uchiha();
    Sasuke.nome = "Sasuke Uchiha";
    Sasuke.idade = 22;
    Sasuke.aldeia = "Aldeia da folha";
    Sasuke.AtivarSharingan();

    Hatake Kakashi = new Hatake();
    Kakashi.nome = "Kakashi Hatake";
    Kakashi.idade = 22;
    Kakashi.aldeia = "Aldeia da folha";
    Kakashi.saudacao();
    Kakashi.AtivarSharingan();
    Kakashi.ninjaDeElite();
    Kakashi.ninjaHokage();
  }
}
