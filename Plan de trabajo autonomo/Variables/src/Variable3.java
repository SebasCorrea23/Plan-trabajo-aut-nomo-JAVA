public class Variable3 {

    public static void main(String [] args){
        int mesesEmbarazo = 10;
        boolean nacimiento = mesesEmbarazo == 9;

        if (nacimiento) {
            System.out.println("El bebé está pronto a nacer");
        } else if (mesesEmbarazo > 9) {
            System.out.println("Hay un error con tu embarazo, es un mojon muy grande");
        } else {
            System.out.println("Aún falta tiempo");
        }

    }
}
