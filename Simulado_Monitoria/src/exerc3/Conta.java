package exerc3;

public class Conta {
  private String nome;
  private double saldo = 0.00;

  public Conta(String nome, double saldo) {
    this.nome = nome;
    this.saldo = saldo;
  }

  public String getNome() {
    return nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor){
    this.saldo += valor;
  }

  public void retirar(double valor){
    if(saldo >= valor){
      saldo -= valor;
    } else{
      System.out.println("Saldo insuficiente!");
    }
  }

  public boolean temSaldo(double valor){
      return saldo >= valor;
  }

  

}
