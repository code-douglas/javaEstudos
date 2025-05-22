package NivelIntermediario.DesafioIntermediarioUm;

public class Ninja {
  String name;
  int age;
  String quest;
  String dificultLevel;
  String questStatus;

  public void showInformation() {
    System.out.println("Nome: " + name);
    System.out.println("Idade: " + age);
    System.out.println("Missão: " + quest);
    System.out.println("Dificuldade da missão: " + dificultLevel);
    System.out.println("Status da missão: " + questStatus);
  }
}
