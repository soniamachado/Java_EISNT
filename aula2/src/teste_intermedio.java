import java.util.Scanner;

/*1-Para converter números inteiros em binário, temos de garantir que:  - - 
apenas lemos números inteiros do utilizador 
se o utilizador introduzir um valor que não seja um inteiro, o programa termina 
*/
public class teste_intermedio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("indique um número: ");

      int numero_utilizador = numvalido(sc);
      System.out.println(
          "Número introduzido: " + numero_utilizador + " | Binário: " + Integer.toBinaryString(numero_utilizador));
    }
  }

  public static int numvalido(Scanner sc) {
    while (!sc.hasNextInt()) {
      System.out.println("Número inválido! O número deve ser um inteiro.");
      sc.next(); // Limpa a entrada inválida
    }
    // int input = sc.nextInt();
    // if (input < 0) {
    // System.out.println("Número inválido! O número deve ser positivo.");
    // System.exit(1); // Termina o programa
    // }
    // return input;
    // }
    return sc.nextInt();
  }
}
