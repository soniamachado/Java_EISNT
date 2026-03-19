public class FuncionarioTempoInteiro extends Funcionario {
  public FuncionarioTempoInteiro(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return salarioBase + 200;
  }
}
