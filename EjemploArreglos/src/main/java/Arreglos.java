import javax.swing.*;

public class Arreglos {

    int cantEst, suma;
    int cantMayores, cantMenores;

    int edades[];
    String nombres[];

    public void iniciar() {
        System.out.println("Listo");

        cantEst = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

        // Creamos los arreglos
        edades = new int[cantEst];
        nombres = new String[cantEst];

        solicitarEstudiantes();
    }

    public void solicitarEstudiantes() {

        // Solicitar las edades
        for (int i = 0; i < cantEst; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante " + (i + 1)));
        }

        // Solicitar los nombres
        solicitarNombres(nombres);

        // Procesar la informacion
        validarMayoresYMenores(edades);
        imprimirListaEstudiantes(edades, nombres);
        promedioEdades(edades);

        // Buscar un estudiante
        String continuar;

        do {
            String nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que desea buscar");

            int edadEncontrada = buscarPorNombres(nombres, edades, nombreBuscado);

            if (edadEncontrada != -1) {
                System.out.println("El estudiante " + nombreBuscado + " tiene " + edadEncontrada + " años.");

                JOptionPane.showMessageDialog(null, "Nombre: " + nombreBuscado + "\nEdad: " + edadEncontrada);

            } else {
                JOptionPane.showMessageDialog(null, "El estudiante no se encuentra registrado.");
            }

            continuar = JOptionPane.showInputDialog("¿Desea buscar otro estudiante? SI / NO");

        } while (continuar != null && continuar.equalsIgnoreCase("SI"));
    }

    // Contar mayores y menores de edad
    public void validarMayoresYMenores(int arregloE[]) {

        cantMayores = 0;
        cantMenores = 0;

        for (int i = 0; i < arregloE.length; i++) {

            if (arregloE[i] >= 18) {
                cantMayores++;
            } else {
                cantMenores++;
            }
        }
    }

    // Imprimir nombres y edades
    public void imprimirListaEstudiantes(int edades[], String nombres[]) {

        System.out.println("\n===== LISTA DE ESTUDIANTES =====");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Edad: " + edades[i]);
        }

        System.out.println("\nLa cantidad de mayores es: " + cantMayores);

        System.out.println("La cantidad de menores es: " + cantMenores);
    }

    // Calcular el promedio de las edades
    public void promedioEdades(int edades[]) {

        suma = 0;

        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }

        double promedio = (double) suma / edades.length;

        System.out.println("El promedio de las edades es: " + promedio);
    }

    // Solicitar los nombres
    public void solicitarNombres(String nombres[]) {

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1));
        }
    }

    // Buscar un estudiante por su nombre
    public int buscarPorNombres(String nombres[], int edades[], String nombreBuscado) {

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equals(nombreBuscado)) {
                return edades[i];
            }
        }

        return -1;
    }

}
