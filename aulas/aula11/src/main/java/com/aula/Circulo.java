package com.aula;

//Circulo <= Forma
public class Circulo extends Forma{
    
    public Circulo(double medida) {
        super(medida);
    }

    @Override 
    public double calcularArea(){
        double r = getMedida();
        return Math.PI * r * r;
    }

    @Override 
    public double calcularPerim(){
        double r = getMedida();
        return 2 * Math.PI * r;
    }
    
}
