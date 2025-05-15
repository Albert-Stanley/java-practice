package com.aula9;

public class Main {
    public static void main(String[] args) {

        Retangulo r = new Retangulo(2,3);  
        System.out.println(r.getMedida());//acesso permitido
        //Via herança
        
        System.out.println(r.getMedida2());
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());

        Forma f = new Forma(2);
        System.out.println(f.calcularArea());
    }
}