import javax.swing.*;

public class Principal {
    // esta es mi clase principal
    public static void main (String [] args){
        menu();
    }

    private static void menu() {
        int opc;
        do {
            String menu = "";
            menu = "<html>";
            menu += "<h2>CALCULADORA</h2>";
            menu += "1. SUMAR<br>";
            menu += "2. RESTAR<br>";
            menu += "3. MULTIPLICAR<br>";
            menu += "4. DIVIDIR<br>";
            menu += "5. Salir<br><br>";
            menu += "<b>Por favor ingrese una opción:</b>";
            menu += "</html>";
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // hacemos switch
            switch (opc){
                case 1: sumar(4,6);
                    break;
                case 2: restar(4,6);
                    break;
                case 3: multiplicar(4,6);
                    break;
                case 4: division(4,0);
                    break;
                case 5: break;
                default:JOptionPane.showMessageDialog(null,"Opcion invalida");
            }
        } while (opc != 5);
    }

    private static void multiplicar(int numero1, int numero2) {
        int mult;
        mult = numero1*numero2;
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mult);
    }

    private static void division(int numero1, int numero2) {
        int div = 0;
        if (numero2!=0){
            div = numero1/ numero2;
            JOptionPane.showMessageDialog(null,"La division es: "+div);
        }
        else {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        }
    }

    private static void restar(int numero1, int numero2) {
        int resta;
        resta = numero1-numero2;
        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
    }

    private static void sumar(int numero1, int numero2) {
        int suma;
        suma = numero1+numero2;
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
    }

}
