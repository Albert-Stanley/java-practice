import java.util.Random;
import java.util.Scanner;

public class Jogo {
  private int numeroSorteado;

  public Jogo(){
    this.numeroSorteado = 0;
  }

  public void sortear( ){
    Random random = new Random();
    this.numeroSorteado = random.nextInt(100);
  }

  public void adivinhar(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Tente adivinhar o numero (de 0 a 99): ");
    int palpite = scanner.nextInt();

    if(palpite == numeroSorteado){ 
    System.out.println("Parabéns você acertou!");
  } else {
    System.out.println("Errado, o número sorteado era: " + numeroSorteado);    
  }
  }
}
