public class EmpregadoTempoInteiro extends Empregado {
  public EmpregadoTempoInteiro(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalarioTotal() {
    return salarioBase + 100;
  }
}
