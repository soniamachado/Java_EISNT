import java.util.Scanner;

public class exercicios_ciclos {
  static void main(String[] args) {

    // 1- contar números pares num range de 1 a 50
    for (int i = 1; i <= 50; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " é par.");
      }
    }
    // 2- soma dos número até que o usuário digite 0
    Scanner sc = new Scanner(System.in);
    int soma = 0; // ← Variável soma
    System.out.println("=== SOMA DOS NÚMEROS ===");
    while (true) {
      System.out.print("Digite um número (0 para sair): ");
      int numero = sc.nextInt();

      if (numero == 0) {
        break; // ✅ Sai do loop
      }
      soma += numero; // ← ACUMULA soma
      System.out.println("Você digitou: " + numero + " | Soma atual: " + soma);
    }
    System.out.println("SOMA TOTAL: " + soma); // ← RESULTADO FINAL

    // 3-Pede ao utilizador um número e imprime a respetiva tabuada de 1 a 10 usando
    // um ciclo for

    System.out.println("Indique um número e aparecerá a tabuada dele mesmo: ");
    int tabuada = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
    }

    // 4-Encontrar o maior número Pede 5 números ao utilizador e indica qual é o
    // maior.
    int lista[] = new int[5];
    int maior = Integer.MIN_VALUE; // ← Começa com menor possível

    for (int i = 0; i < 5; i++) { // ← i de 0 a 4
      System.out.print("Número " + (i + 1) + ": ");
      lista[i] = sc.nextInt(); // ← GUARDA no array

      if (lista[i] > maior) { // ← COMPARA
        maior = lista[i];
      }
    }

    System.out.println("MAIOR: " + maior);

    // 5- Contagem decrescente Imprime uma contagem decrescente de 10 até 0 usando
    // while.
    int contador = 10;
    while (contador >= 0) {
      System.out.println(contador);
      contador--; // ← DECREMENTA
    }
    sc.close();
  }
}