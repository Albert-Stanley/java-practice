package com.aula1;

public class Aula1 {
    public static void main(String[] args) {
        Contador k = new Contador();
        k.incrementar();
        k.incrementar();
        k.incrementar();
        k.incrementar();
        k.decrementar();
        k.mostrar(); // 3
        k.zerar();
        k.mostrar(); // 0
        k.decrementar();
        k.mostrar(); // 0
    }
}