public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private boolean vegetariana;
    
    public Pessoa(int idade, String nome, String sexo, boolean vegetariana) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.vegetariana = vegetariana;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public boolean isVegetariana() {
        return vegetariana;
    }
    
    
    
}
