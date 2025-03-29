//oque seria um atributo, classe, instancia, pacote, acesso


// ATRIBUTO -> PRIVATE
// METODO -> PUBLIC
package com.aula;

public class Aluno {

    private String nome, ra;
    private double pr;

    public Aluno (String nome,
                  String ra,
                  double pr){

            this.ra = ra;                    
            this.nome = nome;
            this.pr = Math.min(10, Math.max(0, pr)); //validacao        

    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Pr: " + pr);
    }


    //EVITAR HORRIVEL!!!! -> Acesso de restrita
    public void setPr(double pr){
        this.pr = pr;
    }

    //Acesso de leitura
    public double getPr(){
        return pr;
    }
    public String getNome() {
        return nome;
    }
    public String getRa() {
        return ra;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

// USAR REGRA DE NEGOCIO AO INVES DE FAZER ISSO    


}
