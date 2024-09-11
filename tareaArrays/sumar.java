package tareaArrays;

public class sumar {

    public int somarPares() {
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            // Verificar que el número sea par
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
