package NivelIntermediario.DesafioIntermediarioUm;

public class Uchiha extends Ninja {
  String specialHability;

  public void showAllInfo () {
    System.out.println("Nome: " + name);
    System.out.println("Idade: " + age);
    System.out.println("Missão: " + quest);
    System.out.println("Dificuldade da missão: " + dificultLevel);
    System.out.println("Status da missão: " + questStatus);
    System.out.println("Habilidade Especial: " + specialHability );

  }
}
