import java.util.Scanner;

public class teste_intermedio_1 {
  /*
   * 2-Criem dois métodos - adicionar que aceita 2 argumentos inteiros (Integer),
   * e devolve um inteiro que
   * representa a sua soma. - multiplicar que aceita 2 argumentos inteiros
   * (Integer), e devolve um inteiro que
   * representa a sua multiplicação.
   */

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  // Escrever o resultado das seguintes operações
  System.out.println("O resultado da soma = "+  adicionar(10,32)); 
  System.out.println("O resultado da multiplicação = " + multiplicar(10,43)); 
  sc.close();
}

    // Método adicionar
  public static int adicionar(int a, int b) {
    return a + b;
  }

  // Método multiplicar
  public static int multiplicar(int a, int b) {
    return a * b;
  }

}

