
package boletin5_6;

import java.util.Scanner;

public class almacen {
    public class Almacen {
    private String tipo,nomArt;
    private Scanner sc = new Scanner (System.in);
    private int vendas;
    
    public Almacen(){
        
    }
    
    public void ventas(){
        System.out.println("Introducir nombre del articulo - ");
        nomArt = sc.nextLine();
        
        System.out.println("Numero de ventas al ano del articulo "+ nomArt +" - ");
        vendas = sc.nextInt();
        
        if (vendas>1000)
            tipo= "Primera necesidad";
        else if (((vendas>500)&&vendas<=500))
            tipo = "Alta de demanda";
        else if ((vendas>100)&&(vendas<=500))
            tipo = "Media de demanda";
        else
            tipo = "Baixa de demanda";
        
        System.out.println("O artigo "+ nomArt +" é un artigo de "+ tipo +" porque vende "+ vendas +" unidades no ano ");
    } 
    }
