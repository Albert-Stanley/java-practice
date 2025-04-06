
import java.util.ArrayList;


public class Cliente {
  private String nome;
  private String cpf;
  private ArrayList<Telefone> telefones;

  public Cliente(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
    this.telefones = new ArrayList<>();  
  }

  public void adicionarTelefone(Telefone telefone){
  telefones.add(telefone);
  }

  public void mostrarDados(){
    System.out.println("Nome: " + nome);
    System.out.println("Cpf: " + cpf);
    System.out.println("Telefones: ");
    for (Telefone t : telefones) {
      System.out.println("- " + t);
    }
    
  }

}
