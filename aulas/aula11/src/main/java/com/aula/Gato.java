package com.aula;

//Se SerVivo <= Mamifero
//E Gato <= Mamifero
//Entao Gato <= SerVivo
public class Gato implements Mamifero {

    @Override
    public void mamar() {
        System.out.println("MAMOU COMO GATO");
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAUUU");
    }

    @Override
    public void reproduzir() {
        System.out.println("REPRODUZIU COMO GATO");
    }

    public void arranhar(){
        System.out.println("Arranhou!");
    }


}
