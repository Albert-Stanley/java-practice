
package com.aula9;


//Retangulo <= Forma
//Retangulo IS-A Forma
//Construtor na superclasse deve ter na subclasse
public class Retangulo extends Forma {
    private double medida2;

    public Retangulo (double medida, double medida2) {
      //chama o construtor da superclasse
      super(medida);
      this.medida2 = medida2;
    
    }

    public double getMedida2() {
      return medida2;
    }

    @Override
    public double calcularArea() {
      //return medida*medida2; caso medida seja protected
      return medida2 * getMedida();
    }

    @Override 
    public double calcularPerimetro() {
      return 2 * getMedida() + medida2;
    }
}
