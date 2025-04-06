public class Churrasco {
  private double qntCarne;

  public Churrasco(){
    this.qntCarne = 0.00;
  }

  public void verificarConsumo(Pessoa p){
  
    if(p.getIdade() <= 3 || p.isVegetariana() ){
      return;
    } else if(p.getIdade() <= 12 && p.getIdade() >= 4 ){
      qntCarne += 1.00;
    } else if(p.getIdade() >= 13){
      qntCarne += 2.00;
    }
  }

  public double getQntCarne(){
    return qntCarne;
  }
}
