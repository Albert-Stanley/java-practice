package com.aula;


public interface Mamifero extends SerVivo {

    int NUMERO_DE_OLHOS = 2;
    //1- Seu comportamento depende das subclasses? S
    //2- Voce faz sentido aqui? N
    void mamar();

    //1- Seu comportamento depende das subclasses? S
    //2- Voce faz sentido aqui? N
    void emitirSom();

    public static void andar(){
        System.out.println("ANDOU");
    }

}
