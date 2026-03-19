public class Empregado {
  String nome;
  double salarioBase;

  public Empregado(String nome, double salarioBase) {
    this.nome = nome;
    this.salarioBase = salarioBase;
  }

  public String getNome() {
    return nome;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public double calcularSalarioTotal() {
    return salarioBase;
  }

  public double calcularBandaIRS() {
    double rendimentoAnual = calcularSalarioTotal() * 14;
    if (rendimentoAnual <= 10000) return 0;
    else if (rendimentoAnual <= 20000) return 10;
    else if (rendimentoAnual <= 35000) return 20;
    else return 30;
  }
}
