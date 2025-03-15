import javax.swing.*;

public class Dowhile3 {

    public static void main(String [] args){
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para sumar desde 1 hasta ese número"));
        int tope = 0;
        int i = 1;

        do {
            tope += i;
            i++;
        } while (i <= limite);

        JOptionPane.showMessageDialog(null, "La suma de los números desde 1 hasta " + limite + " es: " + tope);

    }
}
