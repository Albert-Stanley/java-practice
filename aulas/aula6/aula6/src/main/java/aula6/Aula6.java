
package aula6;

import java.util.Optional;

public class Aula6 {

    public static void main(String[] args) {
       Carrinho k = new Carrinho();
       Produto p1 = new Produto("Caneta",9,Tipo.ESCRITORIO);
       Produto p2 = new Produto("Lapis",6,Tipo.ESCRITORIO);

       k.adicionar(p1);
       k.adicionar(p2);

       Optional<Produto> buscado = k.buscarPrimeiroNome("mouse");
        if(buscado.isPresent()){
        buscado.get().mostrar();
        } else {
            System.err.println("Produto nao achado");
        }
        
    }
}
