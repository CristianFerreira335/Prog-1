package tareaArrays;

public class FIbonacciCalculator {
      
    public int maxNumero;

    public FIbonacciCalculator(int maxNumero) {
        this.maxNumero = maxNumero;
    }

    public int calculate() {
        int previousNumber = 0;
        int nextNumber = 1;
        int lastNumber = previousNumber; // Inicializa con el primer número de la serie

        for (int i = 1; i <= maxNumero; ++i) {
            lastNumber = previousNumber; // Actualiza el último número
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return lastNumber;
    }
}
