import javax.swing.*;

public class Principal {
    // esta es mi clase principal
    public static void main(String [] args ){

        // Inicializamos las variables
        int codigo=0;
        String menu ="";
        int bandera =0,cantidadPlatosProcesados = 0;
        double cuenta1=0,cuenta2=0,cuenta3=0;
        int cantidadTipico=0,cantidadCarta=0,cantidadInternacional=0;
        double valorTotal;
        String factura="";

        // Hacemos estructura repitiva
        do {
            menu = "<html>";
            menu += "<h2>MENU RESTAURANTE</h2>";
            menu += "1. Plato típico<br>";
            menu += "2. Plato a la carta<br>";
            menu += "3. Plato Internacional<br>";
            menu += "4. Salir<br><br>";
            menu += "<b>Por favor ingrese una opción:</b>";
            menu += "</html>";

            // Imprimimos el menu
            codigo = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Hcaemos swicht case para el usuario ingrese una opcion :

            switch (codigo){
                case 1:
                    int opc;
                    String menuTipico="";
                    menuTipico += "<html>";
                    menuTipico += "<h2> MENU TIPICO </h2>";
                    menuTipico+= "1. Frijoles <br>";
                    menuTipico+= "2. Sopa De verduras <br>";
                    menuTipico+= "3. Regresar <br> ";
                    menuTipico+= "<b>Por favor ingrese una opción:</b>";
                    menuTipico += "</html>";
                    opc = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                    cantidadTipico++;
                    // Hacemos un switch
                    switch (opc){
                        case 1:cuenta1 = 12000;
                            JOptionPane.showMessageDialog(null, "Has solicitado un plato de frijoles, el costo es de $:"+cuenta1);
                            break;
                        case 2:cuenta1 = 8000;
                            JOptionPane.showMessageDialog(null,"Has solicitado un lato de verduras, el costo es de $: "+cuenta1);
                            break;
                        case 3:
                            break;
                        default:JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    }
                    break;
                case 2:
                    String platoCarta="";
                    int opcionCarta=0;
                    platoCarta += "<html>";
                    platoCarta += "<h2> PLATO A LA CARTA </h2>";
                    platoCarta+= "1. Asado al barril <br>";
                    platoCarta+= "2. Brasa a la parilla <br>";
                    platoCarta+= "3. Regresar <br> ";
                    platoCarta+= "<b>Por favor ingrese una opción:</b>";
                    platoCarta += "</html>";
                    opcionCarta = Integer.parseInt(JOptionPane.showInputDialog(platoCarta));

                    cantidadCarta++;
                    // hacemos un switch
                    switch (opcionCarta){
                        case 1:cuenta2= 32000;
                            JOptionPane.showMessageDialog(null,"Has solicitado asado al barril la cuenta es de $:  "+cuenta2);
                            break;
                        case 2:
                            cuenta2= 35000;
                            JOptionPane.showMessageDialog(null,"Has solicitado brasa a la parrila la cuenta es de $:  "+cuenta2);
                            break;
                        case 3:
                            break;
                        default:JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                    }
                    break;
                case 3:
                    String platoInternacional="";
                    int opcPlatoInternacional=0;
                    platoInternacional += "<html>";
                    platoInternacional += "<h2> PLATO INTERNACIONAL </h2>";
                    platoInternacional+= "1. Pasta italiana <br>";
                    platoInternacional+= "2. Suchi Japones <br>";
                    platoInternacional+= "3. Regresar <br> ";
                    platoInternacional+= "<b>Por favor ingrese una opción:</b>";
                    platoInternacional += "</html>";
                    opcPlatoInternacional= Integer.parseInt(JOptionPane.showInputDialog(platoInternacional));

                    cantidadInternacional++;
                    // Hacemos el swicht case
                    switch (opcPlatoInternacional){
                        case 1:
                            cuenta3= 50000;
                            JOptionPane.showMessageDialog(null, "Has solicitado Pasta italiana, el costo es de $:"+cuenta3);
                            break;
                        case 2: cuenta3= 60000;
                            JOptionPane.showMessageDialog(null, "Has solicitado Suchi japones, el costo es de $:"+cuenta3);
                            break;
                        case 3:
                            break;
                        default:JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                    }
                    break;
                case 4:JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
            
           cantidadPlatosProcesados= cantidadTipico+cantidadCarta+cantidadInternacional;

            JOptionPane.showMessageDialog(null,"La cantidad de platos procesados Hasta el momento es de : "+cantidadPlatosProcesados);
        }while (codigo !=4);


        // Hacemos la factura:
        valorTotal = cuenta1 + cuenta2 + cuenta3;

        factura = "<html>";
        factura += "<div style='text-align:center;'>";
        factura += "<h2>🧾 FACTURA RESTAURANTE</h2>";
        factura += "<p>Gracias por preferirnos</p>";
        factura += "</div>";
        factura += "<hr>";
        factura += "<table>";
        factura += "<tr>";
        factura += "<td><b>Platos típicos:</b></td>";
        factura += "<td>" + cantidadTipico + "</td>";
        factura += "</tr>";
        factura += "<tr>";
        factura += "<td><b>Platos a la carta:</b></td>";
        factura += "<td>" + cantidadCarta + "</td>";
        factura += "</tr>";
        factura += "<tr>";
        factura += "<td><b>Platos internacionales:</b></td>";
        factura += "<td>" + cantidadInternacional + "</td>";
        factura += "</tr>";
        factura += "</table>";
        factura += "<hr>";
        factura += "<p><b>Cantidad total de platos:</b> "
                + cantidadPlatosProcesados + "</p>";
        factura += "<h3>VALOR TOTAL A PAGAR: $"
                + valorTotal + "</h3>";
        factura += "<hr>";
        factura += "<div style='text-align:center;'>";
        factura += "<b>¡Muchas gracias por tomar nuestro servicio!</b>";
        factura += "<br>";
        factura += "Esperamos volver a atenderte.";
        factura += "</div>";
        factura += "</html>";
        JOptionPane.showMessageDialog(null, factura);
    }

}
