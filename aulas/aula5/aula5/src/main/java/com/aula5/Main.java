package com.aula5;

public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("Apagador", 20, Tipo.ESCRITORIO);       
    Produto p2 = new Produto("Tsx", 20, Tipo.TECNOLOGIA);       
    Produto p3 = new Produto("Blusa", 20, Tipo.VESTUARIO);       

    Carrinho k = new Carrinho();

    k.cadastrar(p3);
    k.cadastrar(p2);
    k.cadastrar(p1);
    k.listar();
    k.remover();    

        k.listar();
    System.out.println(k.calcularTotalTipo(Tipo.ESCRITORIO));
}
}