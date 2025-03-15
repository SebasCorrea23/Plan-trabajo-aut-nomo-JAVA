import javax.swing.*;

public class Constante1 {

    public static void main(String [] args){
        double lado1 =Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado 1"));
        double lado2 =Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado 2"));

        final double AREA_RECTANGULO= lado1 * lado2;

        JOptionPane.showMessageDialog(null, "el area del RECTANGULO es: "+ AREA_RECTANGULO);

    }
}
