import javax.swing.*;

public class Principal {

    // esta es mi clase principal
    public static void main (String [] args){

        // creamos las variables correspondoentes
        double ventas,comision;
        String menu="";
        int opc;
        char letra;
        // Hacemos un menu do-while
        do {

            ventas = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor total de las ventas: "));
            menu = "<html>";
            menu += "<h2>MENU VENTAS</h2>";
            menu += "A. Comision del 8%<br>";
            menu += "B. Comision del 6%<br>";
            menu += "C. Comision del 4%<br>";
            menu += "D. Comision del 2%<br>";
            menu += "E. SALIR!!!!!!<br><br>";
            menu += "<b>Por favor ingrese una opción:</b>";
            menu += "</html>";


            letra = JOptionPane.showInputDialog(menu).toLowerCase().charAt(0);

            // Hacemos el switch
            switch (letra){
                case 'a':comision = ventas * 0.08;
                ventas+= comision;
                JOptionPane.showMessageDialog(null,"El total de ventas fue de : "+ventas);
                    break;
                case 'b':comision = ventas * 0.06;
                    ventas+= comision;
                    JOptionPane.showMessageDialog(null,"El total de ventas fue de : "+ventas);
                    break;
                case 'c':comision = ventas * 0.04;
                    ventas+= comision;
                    JOptionPane.showMessageDialog(null,"El total de ventas fue de : "+ventas);
                    break;
                case 'd':comision = ventas * 0.02;
                    ventas+= comision;
                    JOptionPane.showMessageDialog(null,"El total de ventas fue de : "+ventas);
                    break;
                case 'e':break;
                default: JOptionPane.showMessageDialog(null, "Ingresaste una opcion incorrecta");

            }
            //opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }while(letra != 'e');







    }





}
