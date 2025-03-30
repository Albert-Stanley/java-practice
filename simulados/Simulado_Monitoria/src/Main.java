package exerc1;

public class Main {
    public static void main(String[] args) {
        // Carro meuCarro = new Carro();

        // meuCarro.mostrarEstado(); // Estado inicial

        // meuCarro.alterarEstado(); // DESLIGADO -> LIGADO
        // meuCarro.mostrarEstado();

        // meuCarro.alterarEstado(); // LIGADO -> MOVENDO
        // meuCarro.mostrarEstado();

        // meuCarro.acelerar(30.0); // Acelerando
        // meuCarro.mostrarEstado();

        // meuCarro.alterarEstado(); // MOVENDO -> PARADO
        // meuCarro.mostrarEstado();

        // meuCarro.alterarEstado(); // PARADO -> DESLIGADO
        // meuCarro.mostrarEstado();
    }
}



// Verdadeiro ou falso
// -a falso, pois após ser declarado como final o seu valor é como uma constante e não pode ser alterado

// b- falso , por si só ela não caracteriza uma arvore binaria, apenas possuir dois atributos do tipo B não significa que a classe B representa uma árvore binária. Para ser uma árvore binária, os atributos precisariam ser referências para objetos do mesmo tipo (B), representando os nós esquerdo e direito. Além disso, outras características como um nó raiz e métodos para inserção e remoção deveriam estar presentes.

// c- falsa, O modificador static não impede o acesso externo a um atributo. Ele apenas significa que o atributo pertence à classe e não a instâncias individuais. Para impedir o acesso externo, precisaríamos usar o modificador private.

// d- falso, pois o método setter da acesso de escrita a um atributo e nao metodo

// e- falso, pois usar todos os métodos publics nem sempre é uma pratca ja que são necessários para a interação com a classe.

// f- verdadeiro, Os valores de um enum são públicos e imutáveis por padrão.

// g- verdadeiro,  int é um tipo primitivo. O tipo correspondente da classe Wrapper é Integer, um objeto que encapsula um valor int.

// h- falso, pois vemos que ele é comun no metodo main(String[] args)

//i- verdadeiro,  atributo out da classe System é public static final PrintStream out. Ele é estático e público, permitindo acesso global para saída no console.

// j- falso, pois como default um atributo String sem construtores tem o valor null

//String[] é um array de objetos String, ou seja, uma lista de várias strings. 
// public class Exemplo {
//     public static void main(String[] args) {
//         // Declarando e inicializando um array de Strings
//         String[] nomes = {"João", "Maria", "Carlos"};
        
//         // Acessando e imprimindo os elementos do array
//         System.out.println(nomes[0]);  // João
//         System.out.println(nomes[1]);  // Maria
//         System.out.println(nomes[2]);  // Carlos
//     }
// }
