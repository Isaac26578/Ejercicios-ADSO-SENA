import javax.swing.*;

public class Principal {
    // esta es mi clase principal

    /*
    2. Cree un algoritmo que lea un número entero y muestre si es menor que -2,
    si es mayor o igual a -2 pero menor a 2,
    si es mayor o igual a 2 pero menor a 5, o si es mayor o igual que 5,
     valide este proceso para n cantidad de números. (2.0)
     */
    public static void main (String [] args){
        int n=0, numero =0;

        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n cantidad de veces que quieras validar un numero"));
        // hacemos un for
        for (int i=0; i<n; i++){

            // Le pedimos el numero al usuario
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere validar"));
            // hacemos condicional
            if (numero<-2){
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es menor que -2");
            }
            else if (numero>= -2 && numero <2){
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es mayor o igual a -2 pero menor a 2");
            }
            else if (numero>= 2 && numero<5){
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es mayor o igual a 2 pero menor o igual que 5");
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es mayor que 5");
            }
        }
    }

}
