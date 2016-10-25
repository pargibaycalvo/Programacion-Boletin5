
package boletin5_2;

import javax.swing.JOptionPane;

public class Boletin5_2 {

    public static void main(String[] args) {
        //       
        int a = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        
        suma obxsuma = new suma ();
        obxsuma.verResta(a, b);
        obxsuma.verSuma(a, b);
        
            
        
    }
    
}
    
    
