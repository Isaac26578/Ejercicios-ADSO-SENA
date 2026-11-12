import javax.swing.*;

public class Tabla {
    // Tabla de multiplicar
    private int n;

    // Metodo que imprime la tabla de multiplicar
    public void tabla (){
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que imprima la tabla: "));
        // hacemos un for
        for (int i=1; i<12; i++){
            int mult=0;
            mult = i*n;
            //JOptionPane.showMessageDialog(null,n+" * "+i+" = "+mult);
            System.out.println(n+" * "+i+" = "+mult);
        }

    }






}
