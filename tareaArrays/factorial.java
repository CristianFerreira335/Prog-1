package tareaArrays;

public class factorial {

    public static long calcularFactorial(int numero) {

        if (numero == 0) {
            return 1;

        }
        long resultadoFac = 1;
        for (int i = 1; i <= numero; i++) {

            resultadoFac *= i;

        }

        return resultadoFac;

    }
}
