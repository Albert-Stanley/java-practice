
 
package aula4;


public class Celular {

    private String nome, numero;
    private Bateria bat;
    private Status status;

    public Celular(Bateria bat, String nome, String numero, Status status) {
        this.bat = bat;
        this.nome = nome;
        this.numero = numero;
        this.status = status;
    }

    public void ligar (){
        if(!bat.verificarEnergia() || !status.isOn()){
             return;
        }
             bat.gastar(5);
             System.out.println("OI, " + nome);
            status = Status.ON;
        
    }


    public void Desligar () {
        if(status.isOn()){
            status = Status.OFF;
            System.out.println("...");

        }
    }

    public void mostrarInfo(){
        System.out.println("Nome: " +nome);
        System.out.println("Numero: " +numero);
    }
}
