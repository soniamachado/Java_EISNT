import java.io.*;
import java.util.ArrayList;

public class LeitorCSV {
  public static ArrayList<Empregado> lerFicheiro(String caminho) throws IOException {
    ArrayList<Empregado> lista = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(caminho));

    br.readLine(); // ignora o cabeçalho

    String linha;
    while ((linha = br.readLine()) != null) {
      String[] campos = linha.split(",");
      String nome = campos[0];
      String tipo = campos[1];
      double salarioBase = Double.parseDouble(campos[2]);

      if (tipo.equals("FULLTIME")) {
        lista.add(new EmpregadoTempoInteiro(nome, salarioBase));
      } else {
        lista.add(new EmpregadoMeioTempo(nome, salarioBase));
      }
    }
    br.close();
    return lista;
  }
}
