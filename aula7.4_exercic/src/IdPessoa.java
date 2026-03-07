public class IdPessoa {
  private String nome;
  private int idade;
  private String morada;

  // Construtor
  public IdPessoa(String nome, int idade, String morada) {
    this.nome = nome;
    this.idade = idade;
    this.morada = morada;
  }

  // Getters
  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getMorada() {
    return morada;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setMorada(String morada) {
    this.morada = morada;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s, Idade: %d, Morada: %s",
        nome, idade, morada);
  }
}