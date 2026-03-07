public class main {

  // TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
  // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

  static int MAX = 5;

  String cor = "Azul";

  public static void main(String[] args) {
    System.out.printf("Hello and welcome!");

    var obj1 = new main();
    var obj2 = new main();

    obj1.cor = "Vermelho";
    var a = "12";
    System.out.println("\nCor do obj1: " + a);
    System.out.println("Cor do obj2: " + obj2.cor);

    LerDados.main(args);
  }
}