
package boletin5_3;

public class consola {
    private short num;
    
    public consola (){
}
    public consola(short num){
        this.num=num;    
}
    public void verPositivo (short nu1){
        if (nu1>0)
            System.out.println("+"+ nu1 + "es positivo");
    }
    public void verNegativo (short nu1){
        if (nu1>0)
            System.out.println("-" + nu1 + "es negativo");
    }
    public void verIgual(short nu1){
        if (nu1 == 0)
            System.out.println("0" + nu1 + "es igual a 0");
    }
}
    
    
    
