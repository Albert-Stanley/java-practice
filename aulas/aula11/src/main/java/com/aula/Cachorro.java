package com.aula;

public class Cachorro implements Mamifero{

    @Override
    public void mamar() {
        System.out.println("MAMOU COMO CACHORRINHO");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU");
    }

    @Override
    public void reproduzir() {
        System.out.println("REPRODUZIU IGUAL CACHORRO");
    }

    public void pular(){
        System.out.println("Pulou");
    }
}
