
package aula4;

//Cliente HAS-A endereco
public class Cliente {
    private String nome;
    //Puxo todos os membros publicos de endereco
    //Construtor e o mostrarInformacoes()
    private Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " +nome);
        //Reaproveitamos o codigo ja implementado 
        //em endereco

        endereco.mostrarInfo();
    }

}
