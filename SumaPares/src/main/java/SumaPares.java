import javax.swing.*;

public class SumaPares {
    // esta es mi clase donde va ir toda la logica de negocio
    // creamos variables globales
    int suma, n;


    // creamos un metodo iniciar
    public void iniciar (){
        // Creamos un ciclo repetitivo
        for (int i=1 ;i<3; i++ ){
            int n =pedirDatos();
            boolean validar = validarNumero(n);
            if (validar == true){
                calcularsuma();
                imprimir();
            }

        }
    }


    // Creamos un metodo para pedir datos
    public int pedirDatos (){
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero natural "));
        return n;
    }

    // Metodo para validar un numero
    public boolean validarNumero (int numero){
        // validamos
        if (numero<0){
            JOptionPane.showMessageDialog(null, "No se permiten numeros negativos ");
            return  false;
        }

        return true;
    }


    // metodo para calcular la suma
    public void calcularsuma (){

        suma = n * (n + 1) / 2;
    }


    // metodo para imprimir la suma
    public void imprimir (){
        JOptionPane.showMessageDialog(null,"la suma es: "+suma );
    }

}
