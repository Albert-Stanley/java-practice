package com.aula5;

//pilha lifo (last in first out)  

public class Carrinho {


  private Produto[] carrinho;
  private static final int QNT_MAX = 5;
  private int topo;

  public Carrinho () {
    carrinho = new Produto[QNT_MAX];

  }

  public void cadastrar(Produto p){
    assert p != null : "Produto não pode ser nulo";
    assert topo < QNT_MAX : "Carrinho cheio";
    carrinho[topo++] = p;
    
  }
  
  public Produto remover() {
    assert topo > 0: "Topo não pode ser vazio";  
    Produto produto = carrinho[--topo]; 
    carrinho[topo] = null;    
    return produto;   
  }

  public double calcularTotal(Tipo t) {
    double soma = 0;
    for (int i = 0; i < topo; i++) {
      soma += carrinho[i].getPreco();
    }
    return soma;
  }

  public double calcularTotalTipo(Tipo t){
   double somaTipo = 0;
   for(int i =0; i < topo; i++) {
    if(carrinho[i].getTipo().equals(t)){
      somaTipo = somaTipo	+ carrinho[i].getPreco();
    }
  }
  return somaTipo;
  }


  public void listar(){
    for (int i = 0; i < topo; i++) {
        System.out.println(carrinho[i].toString());
    }
  }

}
