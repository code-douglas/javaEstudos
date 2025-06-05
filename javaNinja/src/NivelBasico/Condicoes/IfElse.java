package Condicoes;

public class IfElse {
    public static void main(String[] args) {
        // String nome = "Naruto Uzumaki";
        int idade = 16;
        // boolean hokage = false;
        short numeroDeMissoes = 9;
        String rank = "Sem rank";
        System.out.println(rank);

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: chuunin");
            rank = "Chunin";
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
            rank = "Jounin";
        } else {
            System.out.println("Rank: gennim");
            rank = "Gennim";
        }
    }
}
