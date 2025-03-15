import javax.swing.*;

public class For3 {

    public static void main(String [] args){
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para sumar desde 1 hasta ese número"));
        int tope = 0;

        for (int i = 1; i <= limite; i++) {
            tope += i;
        }

        JOptionPane.showMessageDialog(null, "La suma de los números desde 1 hasta " + limite + " es: " + tope);

    }
}
