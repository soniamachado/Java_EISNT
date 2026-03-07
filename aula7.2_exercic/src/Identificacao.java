public class Identificacao {

  public static void main(String[] args) {

    // Criar 2 contas diferente
    Pessoa pessoa1 = new Pessoa("Sonia", 100);
    Pessoa pessoa2 = new Pessoa("João", 50);
    Pessoa pessoa3 = new Pessoa("", -5); // testes inválidos
    Pessoa pessoa4 = new Pessoa("Maria", 0); // idade zero

    System.out.println("Pessoa1 -> Nome " + pessoa1.getNome() + ",Idade" + pessoa1.getIdade());
    System.out.println("Pessoa2 -> Nome " + pessoa2.getNome() + ",Idade" + pessoa2.getIdade());
    System.out.println("Pessoa3 -> Nome: " + pessoa3.getNome() + ", Idade: " + pessoa3.getIdade());
    System.out.println("Pessoa4 -> Nome: " + pessoa4.getNome() + ", Idade: " + pessoa4.getIdade());

    // testar setter
    System.out.println("\n--Testando Setters ---");
    pessoa1.setNome("Sonia Machado");
    pessoa1.setIdade(-10); // deve rejeitar
    pessoa1.setIdade(28); // deve aceitar

    System.out.println("Pessoal atualizado .>Nome:" + pessoa1.getNome() + ",Idade:" + pessoa1.getIdade());

  }
}