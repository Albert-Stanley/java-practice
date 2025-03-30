package exerc1;

import java.util.ArrayList;


 public class Radar {
  ArrayList<Carro> carros;
  
  public Radar(){
    this.carros = new ArrayList<>();
  }

  public void adicionarCarro(Carro carro){
    carros.add(carro);
  }

  public void mostrarCarrosMovimento(){
    double somaVelocidade = 0.00;
    int cont = 0;

    for (Carro carro : carros) {
      if(carro.getEstado() == EstadoDoCarro.MOVENDO){
        System.out.println("Carro em movimento com velocidade: " + carro.getVelocidade());
        somaVelocidade += carro.getVelocidade();
        cont ++;
      }
    }

    System.out.println("Quantidade de carros em movimento: " + cont);

    if(cont > 0) {
      System.out.println("Velocidade media: " + somaVelocidade/cont + "Km/h");
    } else{
      System.out.println("Nenhum carro está em movimento.");
    }  
  }
  public void listarCarrosDesligados(){
    boolean temDesligado = false;
    for (Carro carro : carros) {
      if(carro.getEstado() == EstadoDoCarro.DESLIGADO ){
        System.out.println("Carro desligado.");
        temDesligado = true;
      }
    }
    if(!temDesligado) {
      System.out.println("Nenhum carro está desligado.");
    }
  }
}
