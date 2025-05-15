package com.aula;

public class Aula11 {

    public static void main(String[] args) {
        Produto p = new Produto();
        System.out.println(Gerador.gerarInsert(p));
        Cliente c = new Cliente();
        System.out.println(Gerador.gerarInsert(c));
        //O java ACEITOU aceitou a linha abaixo, pois
        //Gato <= Mamifero
        //Mamifero m = new Gato();
        //DOWNCAST
        //Gato g = (Gato) m;
        //g.arranhar();

        //Cachorro c = (Cachorro) m;
        //c.pular();
        
        //Cachorro c = new Cachorro();
        //UPCAST
        //SerVivo s = (SerVivo) c;
        //s.pular(); Erro
        //SerVivo  s = new Gato();

        //Em tempo de compilaçao, o Java nao sabe que
        //m eh Gato. Logo, a linha abaixo eh rejeitada
        //pelo compilador.
        //m.arranhar();
        //m.mamar();
        //s.reproduzir();


        
    }
}
