import javax.swing.*;

public class Operaciones {

    // Metodo para calcular los datos del empleado
    public  String pedirDatos(){

        String opcion;
        String tipo="Comision sobre las ventas\n";
        tipo+= "A. Comision del 8%\n";
        tipo+= "B. Comsion del del 6%\n";
        tipo+= "C. Comision del 4%\n";
        tipo+= "D. Comision del 2%\n";

        // Imprimimos el menu
        opcion= JOptionPane.showInputDialog(tipo);


        return opcion;
    }


    public  void interfaz (){

        double ventas =0;
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas"));
        String menu = pedirDatos();
        menuComision(menu,ventas);

    }

    // Metodo para calcular la comision segun el tipo
    public  void menuComision (String tipo, double ventas){
        // creamos unas variables para la comision
        double comision,ventaTotal;

        // Hacemos un switc case para cada caso
        switch (tipo.toUpperCase()){
            case "A":comision = ventas * 0.08;
                ventaTotal = ventas + comision;
                JOptionPane.showMessageDialog(null,"Las ventas fueron: "+ventas+", la comision fue de: "+comision+", y el total fue: "+ventaTotal);
                break;
            case "B":comision = ventas * 0.06;
                ventaTotal = ventas + comision;
                JOptionPane.showMessageDialog(null,"Las ventas fueron: "+ventas+", la comision fue de: "+comision+", y el total fue: "+ventaTotal);
                break;
            case "C":comision = ventas * 0.04;
                ventaTotal = ventas + comision;
                JOptionPane.showMessageDialog(null,"Las ventas fueron: "+ventas+", la comision fue de: "+comision+", y el total fue: "+ventaTotal);
                break;
            case "D":comision = ventas * 0.02;
                ventaTotal = ventas + comision;
                JOptionPane.showMessageDialog(null,"Las ventas fueron: "+ventas+", la comision fue de: "+comision+", y el total fue: "+ventaTotal);
                break;
            default:JOptionPane.showMessageDialog(null,"La opcion es incorrecta");
        }

    }


} // ultimo
