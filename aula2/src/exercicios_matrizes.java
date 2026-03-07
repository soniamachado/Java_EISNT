import java.util.Random;
import java.util.Scanner;

public class exercicios_matrizes {
  public static void main(String[] args) {
    // 1-Exercício: Criar matriz 3x3: Cria uma matriz 3×3 com números introduzidos
    // pelo utilizador e imprime-a em formato de tabela.
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int[][] matriz = new int[4][4];

    // Preencher matriz com números aleatórios (1 a 20)
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matriz[i][j] = rand.nextInt(20) + 1;
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("Indique os números de uma matriz de 3x3: ");

    int[][] matriz_0 = new int[3][3];

    // Inserir valores
    for (int i = 0; i < 3; i++) {
      System.out.println("Linha " + (i + 1) + ":");

      for (int j = 0; j < 3; j++) {
        System.out.println("Indique um número " + (j + 1) + "º:");
        matriz_0[i][j] = sc.nextInt();
      }
    }

    // Imprimir matriz
    System.out.println("\nMatriz:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz_0[i][j] + "\t");
      }
      System.out.println();
    }

    // 2- Exercício: Soma da matriz: Lê uma matriz 3×3 de inteiros e calcula:a soma
    // total dos elementos; a soma da primeira linha; a soma da diagonal principal

    System.out.println("Indique os números de uma matriz de 3x3: ");

    int[][] matriz_1 = new int[3][3];

    // Inserir valores
    for (int i = 0; i < 3; i++) {
      System.out.println("Linha " + (i + 1) + ":");

      for (int j = 0; j < 3; j++) {
        System.out.println("Indique um número " + (j + 1) + "º:");
        matriz_1[i][j] = sc.nextInt();
      }
    }
    int soma_linha = 0;
    int soma_total = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 1; j++) {
        soma_linha += matriz_1[i][j];
      }
      System.out.println("Somatório da linha: " + (soma_linha));
      soma_total += soma_linha;
    }
    System.out.println("Somatório total: " + (soma_total));
    int soma_diagonal = matriz_1[0][2] + matriz_1[1][1] + matriz_1[2][0];
    System.out.println("soma da diagonal " + (soma_diagonal));

    // 3- Exercício: Procurar na matriz: Cria uma matriz 4×4 com números aleatórios
    // entre 1 e 20. Pede ao utilizador um valor e diz se existe na matriz e em que
    // posição.
    int[][] matriz_2 = new int[4][4];

    // Preencher matriz com números aleatórios (1 a 20)
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matriz_2[i][j] = rand.nextInt(20) + 1;
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }

    // Procurar valor
    System.out.println("\nDigite um número para procurar:");
    int valor = sc.nextInt();

    boolean encontrado = false;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (matriz_2[i][j] == valor) {
          System.out.println("Encontrado na posição: [" + i + "][" + j + "]");
          encontrado = true;
        }
      }
    }

    if (!encontrado) {
      System.out.println("Número não encontrado.");
    }

    // 4- Exercício: Matriz identidade. Gera uma matriz identidade 5×5 usando ciclos
    // aninhados.
    int[][] matriz_3 = new int[5][5];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {

        if (i == j) {
          matriz_3[i][j] = 1;
        } else {
          matriz_3[i][j] = 0;
        }

        System.out.print(matriz_3[i][j] + " ");
      }
      System.out.println();
    }

    // 5- Exercício: Maior de cada linha.
    // Cria uma matriz 3×4 com números
    // introduzidos pelo utilizador. Imprime o maior número de cada linha.
    int[][] matriz_4 = new int[3][4];
    // Inserir valores
    for (int i = 0; i < 3; i++) {
      System.out.println("Linha " + (i + 1) + ":");

      for (int j = 0; j < 4; j++) {
        System.out.println("Indique um número " + (j + 1) + "º:");
        matriz_4[i][j] = sc.nextInt();
      }
    }

    // Encontrar o maior número de cada linha
    for (int i = 0; i < 3; i++) {
      int maior = matriz_4[i][0];
      for (int j = 1; j < 4; j++) {
        if (matriz_4[i][j] > maior) {
          maior = matriz_4[i][j];
        }
      }
      System.out.println("Maior número da linha " + (i + 1) + ": " + maior);
    }
    // Imprimir matriz
    System.out.println("\nMatriz:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matriz_4[i][j] + "\t");
      }
      System.out.println();
    }

    sc.close();

  }
}

// questão dentro de arrays devo ter o mesmo número de elementos para fazer um
// loop, é sempre
// do mesmo nº de elementos ou o o 2 array não pode ser menor que o 1 array?