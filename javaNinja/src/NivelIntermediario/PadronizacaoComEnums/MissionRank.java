package NivelIntermediario.PadronizacaoComEnums;

public enum MissionRank {
  D("Baixo", 2),
  C("Medio", 4),
  B("Media ~ Alto", 6),
  A("Alto ~ Muito alto", 8),
  S("Muito alto", 10);

  // private String descricao;
  // private int dificuldade;

  private MissionRank(String descricao, int dificuldade) {
    // this.descricao = descricao;
    // this.dificuldade = dificuldade;
  }

}
