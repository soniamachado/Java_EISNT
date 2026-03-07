import java.util.Scanner;

public class tabuada {
  public static void main() {

    var sc = new Scanner(System.in);
    System.out.println("Indique um número e aparecerá a tabuada dele mesmo: ");

    int numero = sc.nextInt();
    System.out.println("Tabuada do " + numero + ":");
    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);

    }
    sc.close();
  }

}
