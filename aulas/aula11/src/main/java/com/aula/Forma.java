

package com.aula;

public abstract class Forma {

    private double medida;

    public Forma(double medida) {
        this.medida = medida;
    }

    
    public double getMedida() {
        return medida;
    }

    //1- Seu comportamento depende das subclasses? S
    //2- Voce faz sentido aqui? N
    public abstract double calcularArea();

    //1- Seu comportamento depende das subclasses? S
    //2- Voce faz sentido aqui? N
    public abstract double calcularPerim();

}
