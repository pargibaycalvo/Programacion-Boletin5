
package boletin5_3;

import javax.swing.JOptionPane;

public class Boletin5_3 {

    public static void main(String[] args) {
        // 
        int a = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        
        consola obxConsola = new consola();
            obxConsola.verPositivo((short) a);
            obxConsola.verNegativo((short) a);
            obxConsola.verIgual((short) a);
    }
    
}
