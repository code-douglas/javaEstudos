package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Array estaticos, não mudam o tamanho, sendo necessário alocar manualmente
    // memoria; Caso, tente printar algo que não existe em um certo indice o Java
    // irá retornar null
    String[] ninjasArray = new String[3]; // Array padrão;
    ninjasArray[0] = "Naruto";

    // Listas
    // Não são estaticas, podem aumentar e diminuir sem a necessidade de alocação
    // manual;

    List<String> ninjasList = new ArrayList<>();
    ninjasList.add("Naruto");
    ninjasList.add("Sasuke");
    ninjasList.add("Sakura");
    ninjasList.add("Hinata");

    // Adicionar elemento;
    ninjasList.add("Tobirama");

    System.out.println(ninjasList);

    // Remover elemento
    ninjasList.remove("Tobirama");

    System.out.println(ninjasList);

    ninjasList.set(3, "Charuto");

    // Trocar elemento
    System.err.println(ninjasList);

    // Quantidade da lista
    System.out.println(ninjasList.size());
  }

}
