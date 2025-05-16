package Repeticoes;

public class LacosDeRepeticoes {
  public static void main(String[] args) {
    // Laços de repetição, repetem infinitamente, 
    // ou até atingir parametros desejados.    

    // While.
    /*
      int numeroDeClones = 0;
      int numeroMaximoDeClones = 40;

      while(numeroDeClones <= numeroMaximoDeClones) {
        String message = (numeroDeClones == 1 || numeroDeClones == 0) ? "clone" : "clones";
        System.out.println("O naruto fez: " + numeroDeClones + " " + message);
        numeroDeClones++;
      }
    */
    // For.

    for(int i = 1; i < 41; i++) {
      String message = (i == 1 || i == 0) ? "clone" : "clones";
      System.out.println("Naruto fez: " + i + " " + message);
    }
  }
}
