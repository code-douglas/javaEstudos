package NivelIntermediario.PolimorfismoAbstracao;

public class Main {
  public static void main(String[] args) {
    Uzumaki Naruto = new Uzumaki();
    Naruto.nome = "Naruto Uzumaki";
    Naruto.HabilidadeEspecial();
    Naruto.estrategiaDeBatalhaNinja();
    
    Uchiha Sasuke = new Uchiha();
    Sasuke.nome = "Sasuke Uchiha";
    Sasuke.HabilidadeEspecial();
    Sasuke.estrategiaDeBatalhaNinja();
  }
}
