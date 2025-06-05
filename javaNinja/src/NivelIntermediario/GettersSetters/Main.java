package NivelIntermediario.GettersSetters;

public class Main {
  public static void main(String[] args) {
    Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Folha", 22, 50, 1.80);
    System.out.println("Meu nome é: " + Naruto.getNome());
    Naruto.setNome("Narutinho");
    System.out.println("Meu nome é: " + Naruto.getNome());
  }
}
