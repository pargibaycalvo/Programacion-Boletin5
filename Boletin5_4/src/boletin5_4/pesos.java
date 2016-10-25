
package boletin5_4;

public class pesos {
    private int peso1, peso2, nombre1, nombre2;
    
    public pesos(){    
}
    public pesos (short peso1, short peso2, short nombre1, short nombre2){
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;        
    }
    public void verDato1 (short peso1, short peso2, short nombre1, short nombre2){
        if (peso1>peso2)
            System.out.println("la diferencia es" + (peso1-peso2));
        else if (peso1>peso2)
            System.out.println("la diferencia es" + (peso2-peso1));
        else if (peso1==peso2)
            System.out.println("es igual");
    
    }
    }