package tareaArrays;

public class numerosDivisibles {

    // Numeros divisibes
    public int numDivisibles() {

        int div = 0;
        for (int i = 1; i <= 1000; i++) {

            // verificar numeros divisibles
            if (i % 3 == 0 && i % 6 == 0 && i % 9 != 0) {

                div++;
            }

        }
        return div;

    }

}
