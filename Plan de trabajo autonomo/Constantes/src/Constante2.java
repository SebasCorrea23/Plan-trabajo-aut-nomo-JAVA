import javax.swing.*;

public class Constante2 {

    public static void main(String [] args){
        final String MENSAJE="lograste desbloquaer el sistema";

        final int CLAVE=234;
        int intento=Integer.parseInt(JOptionPane.showInputDialog("ingresa la clave de tres digitos"));

        while (CLAVE!=intento){
            JOptionPane.showMessageDialog(null, "clave incorrecta vuelve a intentar");
            intento=Integer.parseInt(JOptionPane.showInputDialog("ingresa la clave de tres digitos"));

        }JOptionPane.showMessageDialog(null, MENSAJE);
    }
}
