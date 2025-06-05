package NivelIntermediario.OverLoadConstrutores;

public abstract class Ninja implements EstrategiaDeBatalha {

  String nome;
  int idade;
  String aldeia;
  int numeroDeMissoesConcluidas;
  Ranks rank;

  public Ninja(String nome, int idade, String aldeia) {
    this.nome = nome;
    this.idade = idade;
    this.aldeia = aldeia;
  }

  public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Ranks rank) {
    this(nome, idade, aldeia);
    this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    this.rank = rank;
  }

  public Ninja() {
  }

  public void HabilidadeEspecial() {
    System.out.println("Joguei uma Kunai");
  }

  public void saudacao() {
    System.out.println("Nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("aldeia: " + aldeia);
    System.out.println("Numero de missões concluidas: " + numeroDeMissoesConcluidas);
    System.out.println("Rank: " + rank);

  }

  @Override
  public void estrategiaDeBatalhaNinja() {
    System.out.println("Está é minha estrategia de combate.");
  }
}
