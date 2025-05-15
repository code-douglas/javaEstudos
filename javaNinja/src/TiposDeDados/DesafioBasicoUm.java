package TiposDeDados;

public class DesafioBasicoUm {
    public static void main(String[] args) {
        String sakura = "Sakura";
        int idadeSakura = 28;
        String missaoSakura = "Missão Sakura";
        String statusDaMissaoSakura = "Falha";
        char dificuldadeSakura = 'S';

        if(idadeSakura < 15) {
            if(dificuldadeSakura == 'C' || dificuldadeSakura == 'D') {
                statusDaMissaoSakura = "Missão concluida";
            } else {
                statusDaMissaoSakura = "Missão não concluida você é muito novo";
            }
        } else {
            statusDaMissaoSakura = "Missão concluida, você é maior de idade.";
        }

        System.out.println("Nome do ninja: " + sakura);
        System.out.println("Idade do ninja: " + idadeSakura);
        System.out.println("Missão: " + missaoSakura);
        System.out.println("Status da missão: " + statusDaMissaoSakura);
        System.out.println("Nivel de dificuldade: " + dificuldadeSakura);

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        String sasuke = "Sasuke";
        int idadeSasuke = 22;
        String missaoSasuke = "Missão Sasuke";
        String statusDaMissaoSasuke = "Completa";
        char dificuldadeSasuke = 'A';

        if(idadeSasuke < 15) {
            if(dificuldadeSasuke == 'C' || dificuldadeSasuke == 'D') {
                statusDaMissaoSasuke = "Missão concluida";
            } else {
                statusDaMissaoSasuke = "Missão não concluida você é muito novo";
            }
        } else {
            statusDaMissaoSasuke = "Missão concluida, você é maior de idade.";
        }

        System.out.println("Nome do ninja: " + sasuke);
        System.out.println("Idade do ninja: " + idadeSasuke);
        System.out.println("Missão: " + missaoSasuke);
        System.out.println("Status da missão: " + statusDaMissaoSasuke);
        System.out.println("Nivel de dificuldade: " + dificuldadeSasuke);

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        String naruto = "Naruto";
        int idadeNaruto = 25;
        String missaoNaruto = "Missão Naruto";
        String statusDaMissaoNaruto = "Em andamento";
        char dificuldadeNaruto = 'S';

        if(idadeNaruto < 15) {
            if(dificuldadeNaruto == 'C' || dificuldadeNaruto == 'D') {
                statusDaMissaoNaruto = "Missão concluida";
            } else {
                statusDaMissaoNaruto = "Missão não concluida você é muito novo";
            }
        } else {
            statusDaMissaoNaruto = "Missão concluida, você é maior de idade.";
        }

        System.out.println("Nome do ninja: " + naruto);
        System.out.println("Idade do ninja: " + idadeNaruto);
        System.out.println("Missão: " + missaoNaruto);
        System.out.println("Status da missão: " + statusDaMissaoNaruto);
        System.out.println("Nivel de dificuldade: " + dificuldadeNaruto);
    }
}
