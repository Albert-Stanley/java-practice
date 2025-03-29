
package com.aula;


public class Aula2 {

    public static void main(String[] args) {
        Aluno a = new Aluno("Aline", "0050482323026", 8);
        // a.setPr(-3);
        a.mostrarInfo();
        System.out.println(a.getPr());
        //Foo f = new Foo();
        // z eh public em Foo, logo
        // f.z tem acesso liberado aqui!
        //int aux = f.z; //leitura
        //f.z = 7; //escrita
        //System.out.println(aux);

        //y eh default em foo( que é de outro pacote)
        //logo f.y  nao tem acesso liberado
        //int aux2 = f.y; // leitura
        // f.y = 10; //escrita
        // System.out.println(aux2);

        // x tem acesso privado em Foo por isso nao libera acesso de escrita e leitura 
        // f.x = 14;
        // System.out.println(f.x);



    }
}
