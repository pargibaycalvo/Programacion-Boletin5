
package boletin5_5;

import java.util.Scanner;

public class Numeros {
    private Scanner sc =new Scanner(System.in);
    private int num1, num2, numMaior;
    private String aux;
    
    public Numeros(){
        
    }
    
    public void numM(){
        
    System.out.println("Introduce el primer numero - ");
    num1 = sc.nextInt();
    System.out.println("Introduce el segundo numero - ");
    num2 = sc.nextInt();
    sc.nextLine();
        
    if (num1>num2){
    System.out.println("Introcuce el tercer numero - ");
    num2 = sc.nextInt();          
    if (num1>num2){
    aux = "Primero";
    numMaior = num1;
    }
    else{
    aux = "Tercero";
    numMaior = num2;
    }
    }   
    else{
    System.out.println("Introduce el tercer numero");
    num1 = sc.nextInt();
    if(num1>num2){
    aux = "Tercero";
    numMaior = num1;
    }
    else{
    aux = "Segundo";
    numMaior = num2;
     }
    }
        
    System.out.println("O " + aux + " ´numero ("+ numMaior + ") é o maior dos tres");
       
    }
    
}