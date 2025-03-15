import javax.swing.*;

public class While3 {

    public static void main(String [] args){
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para sumar desde 1 hasta ese número"));
        int tope = 0;
        int i = 1;

        while (i <= limite) {
            tope += i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "La suma de los números desde 1 hasta " + limite + " es: " + tope);
    }
}
