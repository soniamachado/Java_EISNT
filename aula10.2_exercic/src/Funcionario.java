public class Funcionario {
  String nome;
  int salarioBase;

  public void Funcionario(String nome, double salarioBase) {
    this.nome = nome;
    this.salarioBase = salarioBase;
  }

  public double calcularSalario() {
    return salarioBase;
  }
}
