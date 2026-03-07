public class MainTransacao {

  static void main(String[] args) {

    // Criar 2 contas diferente
    ContaBancaria conta1 = new ContaBancaria("Sonia", 100);
    ContaBancaria conta2 = new ContaBancaria("João", 50);

    System.out.println("Conta1 -> Nome do titular" + conta1.getTitular() + ",Saldo inicial:2" + conta1.getSaldo());
    System.out.println("Conta2 -> Nome do titular" + conta2.getTitular() + ",Saldo inicial:2" + conta2.getSaldo());

    // Operações na conta1
    conta1.depositar(50); // 100+50=150
    conta1.depositar(30); // 100+50=150
    conta1.depositar(200); // 100+50=150

    // Operações na conta2
    conta1.depositar(20); // 50-20=30
    conta1.depositar(-10); // não deve deixar nada, valor inválido

    System.out.println("Conta 1 -Final: " + conta1.getSaldo());
    System.out.println("Conta 2 -Final: " + conta2.getSaldo());
  }
}