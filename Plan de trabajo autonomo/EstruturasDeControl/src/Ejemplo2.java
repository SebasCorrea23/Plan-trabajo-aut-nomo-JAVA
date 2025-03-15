import javax.swing.*;

public class Ejemplo2 {

    public static void main(String [] args){
        final int VALOR_MAYOR=6;
        int caraDado=Integer.parseInt(JOptionPane.showInputDialog("que valor sacaste en el dado?"));

        if (caraDado==VALOR_MAYOR){
            JOptionPane.showMessageDialog(null, "ganaste");
        } else if (caraDado<5) {
            JOptionPane.showMessageDialog(null,"uy...casi ganas");
        }else{
            JOptionPane.showMessageDialog(null, "estas seguro? \nvuelve a lanzarlo");

        }
    }
}
