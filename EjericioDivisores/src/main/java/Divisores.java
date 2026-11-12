import java.util.ArrayList;
import java.util.List;

public class Divisores {
    // esta es mi clase divisores
    // encapsulamos los metodos
    private int inicio;
    private int fin;
    private int divisor;

    // creamos un metodo que me devuelva la lista de los divisores
    public List<Integer> calcularDivisores (){

        List<Integer> divisibles = new ArrayList<>();
        // validamos
        if (this.divisor == 0){
            System.out.println("El divisor no puede ser cero ");
            return divisibles;
        }

        int divisorAbs = Math.abs(this.divisor);

        // Ciclo exterior: recorre el rango
        for (int i = this.inicio; i <= this.fin; i++) {
            int acumulador = Math.abs(i);

            // Ciclo interior: resta sucesiva
            while (acumulador >= divisorAbs) {
                acumulador -= divisorAbs;
            }

            if (acumulador == 0) {
                divisibles.add(i);
            }
        }

        return divisibles;
    }


    // Utilizamos metodos setters

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    // metodos getters
    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getDivisor() {
        return divisor;
    }


} // ultimo






