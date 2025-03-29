package com.aula1;

public class Aula2 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("REX","SRD");
        c.latir();
        c.mostrarRaca();

        Cachorro d = new Cachorro("Monstro", "Poodle");
        d.latir();
        d.mostrarRaca();
    }

}
