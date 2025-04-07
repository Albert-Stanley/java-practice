public class Porta {
  
  private boolean isOpen;
  private static int numAberturas = 0;

  public Porta(){
    this.isOpen = false;
  }
  
  public void abrir(){
    if(!isOpen){
      this.isOpen = true;
      numAberturas++;
    }
  }

  public void fecharPorta(){
    isOpen = false;
  }

  public static int getNumAberturas(){
    return numAberturas;
  }

  public boolean isAberta(){
    return isOpen;
  }
}

