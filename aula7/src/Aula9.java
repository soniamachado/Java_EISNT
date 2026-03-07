public class Aula9 {
  public static void main(String[] args) {
    Estudante[] estudantes = new Estudante[10];
    for (int i = 0; i < 10; i++) {
      Estudante estudante = new Estudante();
      estudante.nome = "estudante Lima";
      estudante.morada = "Visei";
      estudante.nota = 19.0;

      // Composicao de objetos
      estudante.carroPessoal = new Carro();
      estudante.carroPessoal.modelo = "mod3";
      estudante.carroPessoal.marca = "Tesla";

      System.out.println("O nome é" + estudante.nome);
      estudantes[i] = estudante;
    }

  }
}
