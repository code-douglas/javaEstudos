package NivelIntermediario.Construtores;

public class Main {
  public static void main(String[] args) {
    Hokages Tobirama = new Hokages("Tobirama Senju", 25, false);
    System.out.println(Tobirama.nome);

    Hokages Hiruzen = new Hokages("Hiruzen Sarutobi", 25, false);
    System.out.println(Hiruzen.nome);
  }
}
