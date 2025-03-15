import javax.swing.*;

public class Ejemplo3 {

    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número es positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El número es cero");
        }
    }
}
