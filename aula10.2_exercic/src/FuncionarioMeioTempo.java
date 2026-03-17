public class FuncionarioMeioTempo extends Funcionario {
  public FuncionarioMeioTempo(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return salarioBase * 0.5;
  }
}
