import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Princial {
    // esta es mi clase principal
    public static void main (String [] args){

        String msj;
        msj = pedirDatos("Isaac","Fisica");
        JOptionPane.showMessageDialog(null,msj);

    }

    // Metodo para pedir las notas del estudiante
    public static double pedirNotas (){
        double nota1,nota2,nota3;
        nota1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1: "));
        nota2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2: "));
        nota3= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3: "));

        double promedio= calcularPromedio(nota1,nota2,nota3);
        return promedio;
    }


    //Metodo para pedir datos
    public static String pedirDatos (String nombre, String materia){
        String msj="";
        // llamamos al metodo pedir notas
        double promedio = pedirNotas();
        // Verifamos si gano o perdio el estudiante
        if (promedio >= 3.0){
            msj = "El estudiante gano la materia, con promedio de: "+promedio;
        }
        else {
            msj ="El estudiante perdio la materia Con promedio de: "+promedio;
        }

        return msj;
    }

    // Metodo para calcular promedio
    public static double calcularPromedio (double nota1, double nota2, double nota3){
        double promedio=0;
        promedio =(nota1+nota2+nota3)/3;
        return promedio;
    }

}
