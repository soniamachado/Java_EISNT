public class Pessoa {
  // Propriedades privadas
  private String nome;
  private int idade;

  // Construtor:(impede idade negativo)
  public Pessoa(String nome, int idade) {
    if (nome == null || nome.trim().isEmpty()) {
      System.out.println("Nome inválido.");
      this.nome = "Desconhecido"; // valor padrão
    } else {
      this.nome = nome;
    }
    // Validação idade (não pode ser negativa)
    if (idade < 0) {
      System.out.println("Idade inválido.");
      this.idade = 0; // valor padrão
    } else {
      this.idade = idade;
    }
  }

  // método de Leitura
  public int getIdade() {
    return idade;
  }

  // SETTER Idade (com validação)
  public void setIdade(int idade) {
    if (idade < 0) {
      System.out.println("Idade inválida.");
    } else {
      this.idade = idade;
    }
  }

  // método de Leitura. Getter Nome
  public String getNome() {
    return nome;
  }

  // SETTER Nome (com validação)
  public void setNome(String nome) {
    if (nome == null || nome.trim().isEmpty()) {
      System.out.println("Nome inválido.");
    } else {
      this.nome = nome;
    }
  }
}
/*
 * exerci2: Cria a classe Pessoa com:
 * • Atributos privados: nome, idade
 * • Getters e setters com regras:
 * o idade não pode ser negativa
 * o nome não pode ser vazio
 * Tarefas:
 * 1. Criar várias pessoas e testar restrições.
 */