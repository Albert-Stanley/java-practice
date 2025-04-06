public class Complexo {
  private double a;
  private double b;

  public Complexo(double a, double b){
    this.a = a;
    this.b = b;
  }

  public Complexo soma(Complexo numero){
      return new Complexo(this.a + numero.a , this.b + numero.b);
  }

  public Complexo multiplica(Complexo numero){
    double real = (this.a * numero.a) - (this.b * numero.b);
    double imaginario = (this.a * numero.b) + (this.b * numero.a);
    return new Complexo( real, imaginario);
  }

  @Override
  public String toString(){
    if(b < 0){
      return a + " - " + (-b) + "i";
    } else {
      return a + " + " + b + "i";
    }
  }

  public double modulo() {
    return Math.sqrt(a * a + b * b);
  }

  public double argumentoPrincipal() {
     return Math.atan2(b, a); // já retorna em radianos
  }

}

