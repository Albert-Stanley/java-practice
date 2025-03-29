/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula4;


public class Aula4 {

    public static void main(String[] args) {

      Bateria b = new Bateria(50);
      Celular cel = new Celular(b, "Teste", "12459765456", Status.OFF);

      cel.ligar();
      cel.mostrarInfo();
      // Sapo s1 = new Sapo ();
      // Sapo s2 = new Sapo ();
      // Sapo s3 = new Sapo ();

      // System.out.println(s1.getQtPulo()); //1
      // System.out.println(s2.getQtPulo()); //1
      // System.out.println(s3.getQtPulo()); //1 estatico individual 
      // System.out.println(Sapo.getQtSapo());
    }
}
