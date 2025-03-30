package exerc3;

public class Transferencia {

  static void transferir(Conta de, Conta para, double valor){
   if(de.temSaldo(valor)) {
    de.retirar(valor);
    para.depositar(valor);
   } else{
    System.out.println("Saldo insuficiente!");
   }
  }

}
