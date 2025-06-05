package NivelIntermediario.PadronizacaoComEnums;

public class Main {
  public static void main(String[] args) {
    Missoes missaoUm = new Missoes("Resgatar cachorro", MissionRank.D);
    missaoUm.exibirDetalhes();
  }
}
