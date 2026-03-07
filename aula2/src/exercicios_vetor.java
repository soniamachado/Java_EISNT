
//import java.util.Arrays;
import java.util.Scanner;

public class exercicios_vetor {
  static void main(String[] args) {

    // 1-Guardar nomes:Cria um vetor de 5 posições para guardar nomes introduzidos
    // pelo utilizador e imprime-os todos.
    String[] nomes = new String[5];
    Scanner sc = new Scanner(System.in);

    // 1.1 Guarda 5 nomes no vetor
    for (int i = 0; i < 5; i++) {
      System.out.println("Indique 5 nomes por vez :" + (i + 1));
      nomes[i] = sc.nextLine(); // ← GUARDA o nome no vetor
    }
    // 1.2. Imprime os nomes guardados
    // for (String nome : nomes) { // ← FOR-EACH para imprimir
    // System.out.println("Nome: " + nomes);
    // } ou
    // System.out.println("Nomes: " + Arrays.toString(nomes)); ou
    System.out.print("Nomes: ");// Imprime o texto inicial (sem mudar de linha), print não pula linha
    for (int i = 0; i < 5; i++) {
      System.out.print(nomes[i]);// Imprime o nome guardado na posição i

      if (i < 4) {
        System.out.print(", ");// Imprime uma vírgula e um espaço entre os nomes, mas não após o último nome,
                               // evita ficar assim Ana, Bruno, Carla, Daniel, Eva,
      }
    }
    System.out.println(); // Aqui sim ele pula para a próxima linha, depois de terminar tudo.

    // 2-Média de valores:Cria um vetor com 6 notas (valores double) e imprime a
    // média.
    System.out.println("Indique quantas notas deseja inserir:");
    int quantidade = sc.nextInt();
    double[] notas = new double[quantidade];
    double soma = 0;
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Indique a nota " + (i + 1));
      notas[i] = sc.nextDouble();
      soma += notas[i];
    }
    System.out.println("Média: " + (soma / quantidade));

    // 3- Procurar um valor: Cria um vetor com 10 números aleatórios.Pede ao
    // utilizador um número e diz se existe no vetor e em que posição.
    int[] numeros = { 3, 7, 1, 9, 5, 2, 8, 6, 4, 0 };
    System.out.println("Indique um número para procurar: ");
    int procurar = sc.nextInt();
    boolean encontrado = false;
    for (int num : numeros) {
      if (num == procurar) {
        encontrado = true;
        break;
      }
    }
    if (encontrado) {
      System.out.println(procurar + " foi encontrado no vetor!");
    } else {
      System.out.println(procurar + " NÃO foi encontrado no vetor!");
    }

    // 4-Inverter um vetor: Cria um vetor de 7 números inteiros e imprime-os na
    // ordem inversa.
    int[] vetor = { 3, 7, 1, 9, 5, 2, 8, 6, 4, 0 };
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println(vetor[i]);
      // System.out.println("Nomes: " + Arrays.toString(vetor)), ou
    }
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println(vetor[i]);
      if (i > 0) {
        System.out.print(", ");// Imprime uma vírgula e um espaço entre os números, mas não após o último
                               // número
      }
    }
    System.out.println(); // Pula para a próxima linha após imprimir o vetor invertido

    // 5- Contar ocorrências:Lê 10 números para um vetor e conta quantas vezes
    // aparece o número 5.
    int[] vetor_10 = new int[10];
    System.out.println("Indique 10 números por vez :");
    for (int i = 0; i < 10; i++) {
      System.out.println("Número " + (i + 1));
      vetor_10[i] = sc.nextInt();
    }
    int count = 0;
    for (int num : vetor_10) {
      if (num == 5) {
        count++;
      }
    }
    System.out.println("O número 5 aparece " + count + " vezes.");

    sc.close();
    int idade = 18;

    if (idade < 13) {
      System.out.println("Criança");
    } else if (idade < 18) {
      System.out.println("Adolescente");
    } else {
      System.out.println("Adulto");
    }
    // exmplo. procurar
    String[] nomes_proprios = { "Ana", "João", "Maria", "Pedro" };
    String found = "Maria";
    boolean founded = false;

    for (int i = 0; i < nomes_proprios.length; i++) {
      if (nomes_proprios[i].equals(found)) {
        founded = true;
        break; // para o loop assim que encontrar
      }
    }

    if (founded) {
      System.out.println(found + " foi encontrado!");
    } else {
      System.out.println(found + " NÃO foi encontrado!");
    }
  }
}
