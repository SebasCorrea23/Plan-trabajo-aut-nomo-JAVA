import javax.swing.*;

public class Ejemplo3 {

    public static void main(String[] args){
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        switch (edad) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "Eres un niño.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                JOptionPane.showMessageDialog(null, "Eres un niño o adolescente.");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                JOptionPane.showMessageDialog(null, "Eres un adolescente.");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                JOptionPane.showMessageDialog(null, "Eres un adulto joven.");
                break;
            default:
                if (edad > 21 && edad <= 60) {
                    JOptionPane.showMessageDialog(null, "Eres un adulto.");
                } else if (edad > 60) {
                    JOptionPane.showMessageDialog(null, "Eres un adulto mayor.");
                } else {
                    JOptionPane.showMessageDialog(null, "Edad no válida.");
                }
                break;
        }
    }

}
