
package boletin5_7;

import java.util.Scanner;

public class Boletin5_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        obxFiguras calc1 = new obxFiguras();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la figura deseada :\n1) cuadrado.\n2) triangulo.\n3) circulo." );
        int selector = sc.nextInt();
        sc.nextLine();
        switch(selector){  
        case 1: calc1.cuadrado();
        break;
        case 2: calc1.triangulo();
        break;
        case 3: calc1.circulo();
        break;
        default:System.out.println("error");
        }
   
        
        
        
        
            
  
    }   
}
