public class FuncionarioTempoInteiro extends Funcionario {
  public FuncionarioTempoInteiro(Sring nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return salarioBase + 200;
  }
}
