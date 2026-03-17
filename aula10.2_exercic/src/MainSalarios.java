public class MainSalarios {
  public static void main(String[] args) {
    Funcionario f1 = new FuncionarioTempoInteiro("Ana", 1000);
    Funcionario f2 = new FuncionarioMeioTempo("João", 1000);
    Funcionario f3 = new FuncionarioTempo Inteiro("Maria", 1200);

    System.out.println(f1.nome + "salário"+f1.calcularSalario()); 
    System.out.println(f2.nome + "salário"+f2.calcularSalario()); 
    System.out.println(f3.nome + "salário"+f3.calcularSalario()); 
    
  }
}
/*
 * Cria a superclasse Funcionario:
 * nome, salarioBase
 * Constructor com ambos os atributos acima
 * método calcularSalario()
 * 
 * Cria duas Subclasses:
 * FuncionarioTempoInteiro → salário = base + 200
 * FuncionárioMeioTempo → salário = base * 0.5
 * 
 * Tarefas:
 * Na classe FuncionarioTempoInteiro → faz override do metodo para calclar
 * salario:
 * salário = base + 200
 * Na classe FuncionarioMeioTempo → faz override do metodo para calclar salario:
 * salário = base * 0.5
 * Criar vários funcionários para verificarem o salario de cada um
 */