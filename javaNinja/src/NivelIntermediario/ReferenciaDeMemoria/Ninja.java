package NivelIntermediario.ReferenciaDeMemoria;

public abstract class Ninja {

  String nome;
  int idade;
  String aldeia;
  int numeroDeMissoesConcluidas;

  public Ninja(String nome, int idade, String aldeia) {
    this.nome = nome;
    this.idade = idade;
    this.aldeia = aldeia;
  }

  public void HabilidadeEspecial() {
    System.out.println("Joguei uma Kunai");
  }

  @Override
  public String toString() {
    return "Meu nome é " + nome + " e eu sou um ninja da aldeia da " + aldeia + "!";
  }
}
