import java.util.List;

public class Principal {
    // esta es mi clase principal
    public static void main (String []arsg){
        Divisores divisores = new Divisores();
        divisores.setInicio(1);
        divisores.setFin(50);
        divisores.setDivisor(5);

        // se llama al metodo para calcular los divisores
        List<Integer> resultados = divisores.calcularDivisores();
        System.out.println("Los numeros divisibles entre "+divisores.getDivisor()+" entre"+divisores.getInicio()+" y "+
                divisores.getFin());
        System.out.println(resultados);


    }




}
