package com.aula;

public interface SerVivo {
    //1- Seu comportamento depende das subclasses? N
    //default eh soh para interface
    default void respirar(){
        System.out.println("HUMMMMFFF FUUUUU");
    }

    //1- Seu comportamento depende das subclasses? S
    //2- Voce faz sentido aqui? N
    void reproduzir();

}
