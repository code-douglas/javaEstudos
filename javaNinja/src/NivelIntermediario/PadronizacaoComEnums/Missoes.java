package NivelIntermediario.PadronizacaoComEnums;

public class Missoes {
  private String nome;
  private MissionRank rank;

  public Missoes(String nome, MissionRank rank) {
    this.nome = nome;
    this.rank = rank;
  }

  public void exibirDetalhes() {
    System.out.println("A missão: " + nome + " Rank: " + rank);
  }
}
