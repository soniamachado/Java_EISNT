import java.util.InputMismatchException;
import java.util.Scanner;

public class PAR_IMPAR {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("indique um número: ");
    while (!sc.hasNextInt()) {
      System.out.println("Inválido! Digite número: ");
      sc.next(); // Consome entrada inválida
    }
    int numero_utilizador = sc.nextInt();
    if (numero_utilizador % 2 == 0) {
      System.out.println("O número é par.");
    } else {
      System.out.println("O número é ímpar.");
    }

    double altura = 0; // ← DECLARA AQUI!
    System.out.print("E qual é a sua altura em metros (ex: 1.75)? ");
    try {
      altura = sc.nextDouble(); // ← TENTA ler número
    } catch (InputMismatchException e) {
      // ← APANHA ERRO se digitar "abc"
      System.out.println("Ops! Altura inválida...");
      sc.next(); // ← LIMPA o "abc" do buffer
    } finally {
      sc.nextLine(); // ← SEMPRE executa (limpa Enter)
    }
    System.out.println("Altura: " + altura + "m");
    sc.close();
  }
}
