import javax.swing.*;

public class Principal {
    // esta es mi clase principal
    public static void main (String [] args){

        // Creamos una variable que me ingrese el precio
        double precio=0;
        String menu="",msj="";
        double descuento=0,precioNuevo=0;
        int bandera=0,opc=0;



        menu= "1. Precio 1 -10.000 | Descuento del 0%\n";
        menu+="2. Precio 10.001- 20.001 | Descuento del 5%\n";
        menu+="3. Precio 20.001 -30.001 | Descuento del 8%\n";
        menu+="4. Precio 30.000 en adelante | Descuento del 10%\n\n";

        opc= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la opcion: \n\n"+menu));

        // hacemos switch case para validar que nos haya digitado la opcion correcta

        switch (opc){
            case 1:
                // Le ingresamos el precio
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                if (precio >=1 || precio <= 10.000){
                    descuento = precio * 0.0;
                    precioNuevo = precio -descuento;
                    msj= "El Descuento es "+descuento+" :: el precio nuevo es: "+precioNuevo;
                }
                break;
            case 2:
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                if (precio >=1 || precio <= 10.000){
                    descuento = precio * 0.05;
                    precioNuevo = precio -descuento;
                    msj= "El Descuento es "+descuento+" :: el precio nuevo es: "+precioNuevo;
                }

                break;
            case 3:
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                if (precio >=1 || precio <= 10.000){
                    descuento = precio * 0.08;
                    precioNuevo = precio -descuento;
                    msj= "El Descuento es "+descuento+" :: el precio nuevo es: "+precioNuevo;
                }
                break;
            case 4:
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                if (precio >=1 || precio <= 10.000){
                    descuento = precio * 0.10;
                    precioNuevo = precio -descuento;
                    msj= "El Descuento es "+descuento+" :: el precio nuevo es: "+precioNuevo;
                }
                break;
            default: bandera =-1;

        }
        // ahora validamos que las opciones sean diferentes de -1

        if (bandera != -1){
            JOptionPane.showMessageDialog(null,msj);
        }
        // verificamos que la opcion sea invalida
        else{
            JOptionPane.showMessageDialog(null, "Opcion invalida: ");
        }
    }

} // Ultimo
