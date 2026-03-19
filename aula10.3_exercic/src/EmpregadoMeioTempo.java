public class EmpregadoMeioTempo extends Empregado {
  public EmpregadoMeioTempo(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalarioTotal() {
    return salarioBase + 25;
  }
}
