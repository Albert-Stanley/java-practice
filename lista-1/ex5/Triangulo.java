public class Triangulo {
  private double lado;
  private double perimetro;
  private double area;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    
    public double getLado() {
      return lado;
    }
    
    public double getPerimetro() {
      return perimetro;
    }
    
    public double getArea() {
      return area;
    }
    
    public double calArea(){
      return (lado * Math.sqrt(3)) / 2;
    }

    public double calcPerimetro(){
      return  3 * lado;
    }
}

