package com.aula5;


//modificador final , deixa o atributo constante == const , tornando-o imutavel(imune a atribuição e setters)
public class Produto {

    private final String NOME;
    private double preco;
    private final Tipo tipo;

    public Produto(String NOME, double preco, Tipo tipo) {
        this.NOME = NOME;
        this.preco = preco;
        this.tipo = tipo;
      }
      

    public Tipo getTipo(){
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("NOME=").append(NOME);
        sb.append(", preco=").append(preco);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
