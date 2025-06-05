package NivelIntermediario.MetodosConstantes;

public abstract class Ninja {

  String nome;
  int idade;
  double altura;
  String aldeia;

  public Ninja(String nome, int idade, double altura, String aldeia) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.aldeia = aldeia;
  }

  public void HabilidadeEspecial() {
    System.out.println("Joguei uma Kunai");
  }

  final void jogarKunai() {
    System.out.println(nome + " Acabou de jogar uma Kunai");
  }

  @Override
  public String toString() {
    return "Meu nome é " + nome + " e eu sou um ninja da aldeia da " + aldeia + "!";
  }
}
