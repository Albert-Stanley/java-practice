
package com.aulabd.bd.model;

//POJO - PLAIN OLD JAVA OBJECT
//ESPELHO DA TABELA
public class Cliente {
    private int id;
    private String nome, cpf;

    //INICIALIZAR O FORM
    public Cliente(){

    }
    //CADASTRO
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //MOSTRAR
    public Cliente(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}
