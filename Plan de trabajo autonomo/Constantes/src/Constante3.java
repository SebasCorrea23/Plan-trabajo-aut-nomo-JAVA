import javax.swing.JOptionPane;

public class Constante3 {

    public static void main(String [] args){
        final int EDAD_MINIMA = 18;
        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu edad?"));

        if (edad >= EDAD_MINIMA) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad.\npuedes pasar");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad\nno puedes pasar");
        }
    }
}
