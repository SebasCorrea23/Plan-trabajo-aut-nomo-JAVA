import javax.swing.*;

public class Ejemplo1 {

    public static void main(String [] args){
        int numeroAdivinar= Integer.parseInt(JOptionPane.showInputDialog("ingresa tu numero"));
        int numeroSecreto=3;

        if (numeroAdivinar==numeroSecreto){
            JOptionPane.showMessageDialog(null, "adivinaste");
        }
    }
}
