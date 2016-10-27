
package boletin5_7;

import java.util.Scanner;

class obxFiguras { 
    
    private double lado, base, altura, radio;
    private double pi=3.14;
    private Scanner sc = new Scanner (System.in);
    
    public obxFiguras(){ //constructor
    
    
}
    public obxFiguras (double lado, double base, double altura, double radio){
        this.lado=lado;
        this.base=base;
        this.altura=altura;
        this.radio=radio;
       
    }
    
    public void cuadrado(){
        System.out.print("Introduce lado ");
        lado=sc.nextFloat();
        System.out.println("El area del cuadrado es " + (lado*2));
        sc.nextLine();
    }   
    public void triangulo(){
        System.out.print("Introduce base ");
        base=sc.nextFloat();
        System.out.print("Introduce altura ");
        altura=sc.nextFloat();
        System.out.println("El area del triangulo es " + ((base*altura)/2));
        sc.nextLine();  
    }
    public void circulo(){
        System.out.print("Introduce el radio ");
        radio=sc.nextFloat();
        System.out.println("El area del circulo es " + (pi*Math.pow(radio, 2)));
        sc.nextLine();    
    }
    
}
