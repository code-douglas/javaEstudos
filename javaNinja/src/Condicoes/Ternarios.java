package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        short numeroDeMissoes = 11;
        String verificarQtdMissoes =
                (numeroDeMissoes >= 10)
                        ? "Mais de 10 missões"
                        : "O ninja tem menos do que 10 missões";
        System.out.println(verificarQtdMissoes);
    }
}
