
package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      Circulo circulo1 = new Circulo();
      
    
        circulo1.setRaio(ler.nextDouble());
      circulo1.mostrarResultado();
        System.out.println("valor do raio informado"+circulo1.getRaio()); 
        
        
        
        
    }
    
}
