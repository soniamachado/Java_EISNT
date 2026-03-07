
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorCSV {

  public static List<IdPessoa> lerPessoas(String ficheiro) {
    List<IdPessoa> pessoas = new ArrayList<>();
    Scanner scanner = null;

    try {
      scanner = new Scanner(new FileInputStream(ficheiro));

      // Ignora cabeçalho
      if (scanner.hasNextLine()) {
        scanner.nextLine();
      }

      while (scanner.hasNextLine()) {
        String linha = scanner.nextLine();
        String[] tokens = linha.split(",");

        if (tokens.length == 3) {
          String nome = tokens[0].trim();
          String idadeStr = tokens[1].trim();
          String morada = tokens[2].trim();

          // ⭐ VALIDAÇÃO IDADE
          try {
            int idade = Integer.parseInt(idadeStr);
            if (idade >= 0 && idade <= 120) { // Idade válida
              pessoas.add(new IdPessoa(nome, idade, morada));
            }
          } catch (NumberFormatException e) {
            System.out.println("Idade inválida ignorada: " + linha);
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Erro: Ficheiro '" + ficheiro + "' não encontrado!");
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }

    return pessoas;
  }
}
