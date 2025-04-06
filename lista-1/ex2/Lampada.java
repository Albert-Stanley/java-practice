public class Lampada {
  
  private Estado estado;
  private int contAcendimentos;

  public Lampada(){
    this.estado = Estado.APAGADA;
    this.contAcendimentos = 0;
  }

  public void click(){
    if(estado == Estado.ACESA){
      estado = Estado.APAGADA;
    } else {
      estado = Estado.ACESA;
      contAcendimentos++;
    }
  }

  public int qntAcendimentos(){
    return contAcendimentos;
  }

  public Estado checaEstado(){
    return estado;
  }

}
