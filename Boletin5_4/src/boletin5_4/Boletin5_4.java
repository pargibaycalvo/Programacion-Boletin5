
package boletin5_4;

import javax.swing.JOptionPane;

public class Boletin5_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(JOptionPane.showInputDialog("peso1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("peso2"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("nombre1"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("nombre2"));
        
        pesos obxPesos = new pesos();
        
        obxPesos.verDato1((short)a, (short) b, (short) c, (short) d);
        
    }
    
}
