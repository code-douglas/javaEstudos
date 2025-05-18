package EstruturaDeDados;

public class ArrayDoArray {
  public static void main(String[] args) {
    String[][] ninjaAldeiaCla = new String[3][3];
    ninjaAldeiaCla[0][0] = "Konoha";
    ninjaAldeiaCla[0][1] = "Naruto";
    ninjaAldeiaCla[0][2] = "Uzumaki";

    ninjaAldeiaCla[1][0] = "Nevoa";
    ninjaAldeiaCla[1][1] = "Zabuza";
    ninjaAldeiaCla[1][2] = "Momochi";

    ninjaAldeiaCla[2][0] = "Areia";
    ninjaAldeiaCla[2][1] = "Gaara";
    ninjaAldeiaCla[2][2] = "Kazekage";

    for (int i = 0; i < ninjaAldeiaCla.length; i++) {
      for(int j = 0; j < ninjaAldeiaCla[i].length; j++) {
        System.out.println(ninjaAldeiaCla[i][j]);
      }
    }
  }
}
