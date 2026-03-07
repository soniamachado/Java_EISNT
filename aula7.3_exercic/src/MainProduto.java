public class MainProduto {
  public static void main(String[] args) {
    // Criar produtos
    Produto p1 = new Produto("Notebook", 1500.0, 2);
    Produto p2 = new Produto("Mouse", 25.0, 5);
    Produto p3 = new Produto("Teclado", -10.0, 3); // preço inválido

    // Calcular valor total (CHAMA o método)
    System.out.println(p1.getNome() + ": R$ " + p1.calcularValorTotal());
    System.out.println(p2.getNome() + ": R$ " + p2.calcularValorTotal());
    System.out.println(p3.getNome() + ": R$ " + p3.calcularValorTotal());
  }
}