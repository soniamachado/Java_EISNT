public class ContaBancaria {
  // Propriedades privadas
  private String titular;
  private double saldo;

  // Construtor:titular +saldo inicial(impede saldo negativo)
  public ContaBancaria(String titular, double saldoInicial) {
    this.titular = titular;
    if (saldoInicial < 0) {
      this.saldo = 0; // ou lançar execução, conforme exercicio
    } else {
      this.saldo = saldoInicial;
    }
  }

  // Método depositar

  public void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  // Método levantar (impede saldo negativo)
  public void levantar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor de levantamento inválido");
    } else {
      System.out.println("transação não aceite!Saldo insufeciente.");
    }
  }

  // método de Leitura
  public double getSaldo() {
    return saldo;
  }

  // método de Leitura
  public String getTitular() {
    return titular;
  }
}
