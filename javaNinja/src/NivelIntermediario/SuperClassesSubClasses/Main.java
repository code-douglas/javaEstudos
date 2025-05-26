package NivelIntermediario.SuperClassesSubClasses;

public class Main {
  public static void main(String[] args) {
    
    Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 22, "Folha");
    Naruto.HabilidadeEspecial();
    Naruto.estrategiaDeBatalhaNinja();
    
    Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 22, "Folha");

    Sasuke.HabilidadeEspecial();
    Sasuke.estrategiaDeBatalhaNinja();

    Uchiha Itachi = new Uchiha("Itachi Uchiha", 25, "Folha");
    Itachi.HabilidadeEspecial();
    Itachi.estrategiaDeBatalhaNinja();

  }
}
