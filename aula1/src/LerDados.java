import java.util.Scanner;

public class LerDados {
  static void main(String[] args) {
    var sc = new Scanner(System.in);
    System.out.println("Age: ");

    if (sc.hasNextInt()) {
      System.out.println("You entered an integer.");

      var age = sc.nextInt();
      System.out.println("Age: " + age);
    }
  }

}