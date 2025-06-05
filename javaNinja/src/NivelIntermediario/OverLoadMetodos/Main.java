package NivelIntermediario.OverLoadMetodos;

public class Main {
  public static void main(String[] args) {
    Uzumaki Naruto = new Uzumaki("Naruto", 22, "Folha", 22, Ranks.GENIN);
    Naruto.saudacao();

    Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 22, "Folha");

    Sasuke.HabilidadeEspecial();

    Uchiha Itachi = new Uchiha("Itachi Uchiha", 25, "Folha");
    Itachi.HabilidadeEspecial();

    Uchiha Madara = new Uchiha("Uchiha Madara", 25, "Folha", 40, Ranks.JOUNIN);
    Madara.HabilidadeEspecial();
    Madara.inteligenciaDeCombate();
    Madara.inteligenciaDeCombate(150);
  }
}
