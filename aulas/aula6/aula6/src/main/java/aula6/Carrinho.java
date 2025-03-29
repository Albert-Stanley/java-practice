
package aula6;


import java.util.ArrayList;
import java.util.Optional;


public class Carrinho {

    private ArrayList<Carrinho> carrinho;

    public Carrinho(){
        // A lista deve ser criada na memoria 
        // antes de seu uso
        carrinho = new ArrayList<Produto>();
    }

    public void adicionar(Produto p){ // <= p é o nome do objeto Produto que estou chamando via parametro
        
        if(p != null){ 
        carrinho.add(p);
        }

    }

    public void listar(){
        // for(int i=0; i < carrinho.size(); i++){
        //     carrinho.get(i).mostrar();
        // }

        //For Each do Java
        for(Produto produto : carrinho){
            produto.mostrar();
        }
    }


    public double calcularTotal(){
        double soma = 0;

        for(Produto produto : carrinho){
            soma += produto.getPreco();
        }
        return soma;
    }

    public double calcularTotalPorTipo(Tipo t){
        double soma = 0;
        
        for(Produto produto : carrinho){
            if( t = produto.getTipo() ){
                soma += produto.getPreco();
            }
        }
        return soma;
    }

    public Optional<Produto> buscarPrimeiroNome(String nome){
    for(Produto produto : carrinho){
        //equals compara conteudo
        //== compara endereco memoria
        if(nome.equals(produto.getNome())){
            return Optional.of(produto);
        }
        
        return Optional.empty();
    }

    public ArrayList<Produto> buscarPorNome(String nome){
        ArrayList<Produto> aux = new ArrayList<Produto>();
      for(Produto produto : carrinho){
      if(produto.getNome()){
        aux.add(produto);
      }
      }
      return aux;
    }

    public void removerPorNome(String nome){
        Optional<Produto> produtoAchadoOuNao = buscarPrimeiroNome(nome);

        if(produtoAchadoOuNao.isPresent()){
            carrinho.remove(produtoAchadoOuNao.get());
        } else {
            System.out.println("Produto nao encontrada");
        }
    }

    }
}
