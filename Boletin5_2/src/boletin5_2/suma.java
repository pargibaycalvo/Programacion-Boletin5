
package boletin5_2;

public class suma {
    private short num1, num2;
    
    public suma(){   
    }
    public suma (short num1, short num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void verResta(int nu1, int nu2){
        if (nu1>nu2)
            System.out.println(nu1 + " es mayor ");
        if (nu1<nu2)
            System.out.println(nu1 + " es menor ");
        if (nu1 == nu2)
            System.out.println(" numero 1 y numero 2 son iguales ");
        
        System.out.println(" la resta es "+ (nu1 - nu2));        
    }
    public void verSuma (int nu1, int nu2){
        System.out.println(" las suma es "+ (nu1 + nu2));
        
    }

}
    

    

