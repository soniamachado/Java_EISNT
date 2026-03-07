import java.util.List;

//trata de executar o código, o que se trata código e lógica
public class Main {
  public static void main(String[] args) {
    String ficheiro = "pessoas.csv"; // Default

    // ⭐ ARGUMENTO OPCIONAL
    if (args.length > 0) {
      ficheiro = args[0];
    }

    // Ler ficheiro
    List<IdPessoa> pessoas = LeitorCSV.lerPessoas(ficheiro);

    // Mostrar todas
    System.out.println("=== PESSOAS LIDAS (" + pessoas.size() + ") ===");
    for (IdPessoa p : pessoas) {
      System.out.println(p);
    }

    // ⭐ CONTADOR > 25 anos
    int maiores25 = 0;
    for (IdPessoa p : pessoas) {
      if (p.getIdade() > 25) {
        maiores25++;
      }
    }
    System.out.printf("⭐ Pessoas com mais de 25 anos: %d\n", maiores25);
  }
}