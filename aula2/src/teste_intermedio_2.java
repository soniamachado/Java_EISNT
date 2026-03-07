import java.util.Scanner;

public class teste_intermedio_2 {

  public static void main(String[] args) {

    int[] lista = new int[5];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Vamos encontrar o máximo! ");
    System.out.println("Introduza 5 números: ");

    for (int i = 0; i < 5; i++) {
      lista[i] = scanner.nextInt();
    }

    System.out.println("O máximo foi: " + encontrarMaximo(lista));

    System.out.println("Adeus!!");
    scanner.close();

  }

  static public int encontrarMaximo(int[] lista) {
    int max = lista[0]; // assume que o primeiro é o maior

    for (int i = 1; i < lista.length; i++) {
      if (lista[i] > max) {
        max = lista[i];
      }
    }
    return max;
  }
}
