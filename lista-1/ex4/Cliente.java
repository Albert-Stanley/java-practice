public class Cliente {
  private String nome;
  private double saldo;
  private double limite;

  public Cliente(double limite, String nome, double saldo) {
        this.limite = limite;
        this.nome = nome;
        this.saldo = saldo;
  }

  public String obterNome(){
    return nome;
  }

  public void sacar(double valor){
    if(saldo + limite >= valor){
      saldo -= valor;
    }
  }

  public void depositar(double valor){
      saldo += valor;
  }

  public double checarSaldo(){
    return saldo + limite;
  }

}
