public class Produto {
  // Propriedades privadas
  private String nome;
  private double preco;
  private int quantidade;

  // Construtor:(impede idade negativo)
  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    // Validação preço e quantidade (não pode ser negativa)
    if (preco < 0) {
      System.out.println("Preco inválido.");
      this.preco = 0; // valor padrão
    } else {
      this.preco = preco;
    }
    if (quantidade < 0) {
      System.out.println("quantidade inválido.");
      this.quantidade = 0; // valor padrão
    } else {
      this.quantidade = quantidade;
    }
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public String getNome() {
    return nome;
  }

  // método calcularValorTotal(): faz o cálculo preco * quantidade sempre que
  // chamas.
  public double calcularValorTotal() {
    return preco * quantidade;
  }
}
/*
 * Exerc3:
 * Cria a classe Produto com:
 * • nome, preco, quantidade (privados)
 * Regras:
 * • preco não pode ser < 0
 * • quantidade não pode ser < 0
 * • Método calcularValorTotal()
 * 
 */