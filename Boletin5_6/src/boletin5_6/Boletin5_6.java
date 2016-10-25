
package boletin5_6;

import java.util.Scanner;

public class Boletin5_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        String tipo;
        Scanner sc = new Scanner (System.in);
        String nomArt = sc.nextLine();
        
        System.out.println("Número de ventas nal año "+ nomArt+" : ");
        int vendas = sc.nextInt();
        
        if (vendas>1000)
            tipo = "Primera necesidad";
        else if (((vendas>500)&&(vendas>=1000)))
            tipo = "Alta de demanda";
        else
            tipo = "Baixa de demanda";
        
        System.out.println("articulo "+ nomArt +" es un articulo de "+ tipo +" porque vende "+ vendas +" al año en unidades" );
    }
    
}
 
