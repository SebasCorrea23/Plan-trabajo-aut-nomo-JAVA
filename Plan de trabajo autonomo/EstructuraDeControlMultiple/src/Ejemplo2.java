import javax.swing.*;

public class Ejemplo2 {

    public static void main(String [] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        String operacion = JOptionPane.showInputDialog("Elige una operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");

        switch (operacion) {
            case "1":
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2));
                break;
            case "4":
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2));
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
