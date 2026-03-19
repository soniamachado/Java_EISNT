import java.util.ArrayList;

public class MainSalarioBruto103 {
  public static void main(String[] args) throws Exception {
    ArrayList<Empregado> empregados = LeitorCSV.lerFicheiro("pessoas.csv");

    for (Empregado e : empregados) {
      String tipo = (e instanceof EmpregadoTempoInteiro) ? "FULLTIME" : "HALFTIME";
      System.out.println("Nome: " + e.getNome());
      System.out.println("Tipo: " + tipo);
      System.out.println("Salário Base: " + e.getSalarioBase());
      System.out.println("Salário Total: " + e.calcularSalarioTotal());
      System.out.println("Rendimento Anual: " + (e.calcularSalarioTotal() * 14));
      System.out.println("Banda IRS: " + (int) e.calcularBandaIRS() + "%");
      System.out.println("---");
    }
  }
}
