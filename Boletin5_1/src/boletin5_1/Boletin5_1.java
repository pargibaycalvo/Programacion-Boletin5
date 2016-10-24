
package boletin5_1;

import javax.swing.JOptionPane;

public class Boletin5_1 {

    public static void main(String[] args) {
        // 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        
        positivo obxSimple = new positivo();
        
        obxSimple.verPositivo(num1, num2);
    }
    
}
