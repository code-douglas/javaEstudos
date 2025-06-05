package NivelIntermediario.OverLoadMetodos;

public class Uchiha extends Ninja {

  public Uchiha() {
    super();
  }

  public Uchiha(String nome, int idade, String aldeia) {
    super(nome, idade, aldeia);
  }

  public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Ranks rank) {
    super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
  }

  public void HabilidadeEspecial() {
    System.out.println("Amaterasu");
  }

  public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: " + nome + "E esta é a estrategia de batalha Uchiha");
  }

  @Override
  public void inteligenciaDeCombate() {
    System.out.println("Essa é minha inteligencia de combate Uchiha");
  }

  @Override
  public void inteligenciaDeCombate(int qi) {
    if (qi >= 150) {
      System.out.println("Você é um genio Uchiha");
    } else if (qi >= 130) {
      System.out.println("Vocẽ é promissor Uchiha");
    } else {
      System.out.println("Você precisa estudar Uchiha.");
    }
  }

  @Override
  public void metodoProvisorio() {
    System.out.println("teste na classe uchiha");
  }
}
