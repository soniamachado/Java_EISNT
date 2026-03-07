import java.util.Scanner;

public class lertemperatura {
  static void main(String[] args) {

    var sc = new Scanner(System.in);
    System.out.println("Indique a temperatura em Celsius: ");

    var tempC = sc.nextDouble();

    var tempF = tempC * (9.0 / 5.0) + 32.0;
    System.out.println("Temperatura em Fahrenheit: " + tempF);
    sc.close();
  }
}
