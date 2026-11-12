import javax.swing.*;

public class Principal {
    // esta es mi clase principal

    public static void main (String [] args){

        int n=0;
        int numero=0;
        int i=1;
        // Le pedimos n cantidad de veces al usuario
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n cantidad de veces que quiere que se repita el ciclo"));
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            if (numero<0){
                numero= numero *-1;
                JOptionPane.showMessageDialog(null,"El numero Convertido es: "+numero);
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero es: "+numero);
            }

            i++;
        }while(i<= n);


    }

}
