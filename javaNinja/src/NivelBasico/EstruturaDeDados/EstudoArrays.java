package EstruturaDeDados;

public class EstudoArrays {
  public static void main(String[] args) {
    // Declaração de arrays;
    // Arrays são tipos referencia;
    String[] ninjas = new String[6];
    ninjas[0] = "Naruto Uzumaki";
    ninjas[1] = "Sasuke Uchiha";
    ninjas[2] = "Sakura Haruno";
    ninjas[3] = "Hinata Hyuga";
    ninjas[4] = "Kakashi Hatake";
    // System.out.println(ninjas[4]); // Irá inicializar como null caso seja chamado um espaço da memoria inexistente;

    ninjas = new String[7]; // Está sobrescrevendo espaço na memoria;
    ninjas[0] = "Hashirama Senju";
    ninjas[1] = "Tobirama Senju";
    ninjas[2] = "Hiruzen Sarutobi";
    ninjas[3] = "Minato Namikaze";
    ninjas[4] = "Tsunade";
    ninjas[5] = "Kakashi Hatake";
    ninjas[6] = "Naruto Uzumaki";
    // System.out.println(ninjas[1]); // Irá retornar um array vazio;
    
    for (int i = 0; i < ninjas.length; i++) {
      System.out.println(ninjas[i]);
    }

    int[] idade = new int[2];
    idade[0] = 16;
    // System.out.println(idade[1]); // Irá inicializar como zero;
    
    boolean[] hokage = new boolean[1];
    hokage[0] = true;
    // System.out.println(hokage[0]); // Irá inicializar como false;

    double[] flutuante = new double[1];
    flutuante[0] = 0.1;
    // System.out.println(flutuante[0]); // Irá inicializar como 0.0;
  }
}
