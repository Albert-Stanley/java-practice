package exerc1;

public class Carro {
  private EstadoDoCarro estado;
  private double velocidade;

    public Carro() {
      this.estado = EstadoDoCarro.DESLIGADO;
      this.velocidade = 0.00;
    }


    public EstadoDoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public void alterarEstado(){
      switch (estado) {
          case DESLIGADO:
              estado = EstadoDoCarro.LIGADO;
              break;
          case LIGADO:
              estado = EstadoDoCarro.MOVENDO;
              break;
          case MOVENDO:
              estado = EstadoDoCarro.PARADO;
              velocidade = 0.00;
              break;    
          case PARADO:
              estado = EstadoDoCarro.DESLIGADO;
              break;
            }
    }

    public void acelerar(double incremento) {
      if(estado == EstadoDoCarro.MOVENDO ){
        velocidade += incremento; 
      } else {
        System.out.println("O carro precisa estar movendo para acelerar.");
      }
    }

    public void mostrarEstado(){
    System.out.println("Estado atual: " + this.estado + " | Velocidade atual: " + this.velocidade + "km/h" );
    }

  
}
