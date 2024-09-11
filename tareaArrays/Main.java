package tareaArrays;

public class Main{

    public static void main(String[] args) {
        // Test clase sumar
        sumar sumar = new sumar();
        int resultado = sumar.somarPares();
        System.out.println("La suma de todos los números pares de 1 a 1000 es: " + resultado);

        // Test clase numerosDivisible
        numerosDivisibles div = new numerosDivisibles();
        int resutadoDiv = div.numDivisibles();
        System.out.println("Cantidad de numeros divisibles de 1 a 1000: " + resutadoDiv);

        // Test clase factorial
        int numFactorial = 9;
        long fact = tareaArrays.factorial.calcularFactorial(numFactorial);
        System.out.println("Factorial: " + fact);

        // Test numerosPrimos
        int tam = 15;
        int[] vector = new int[tam];
        int cont = 0;
        int comienzo = 2; // numero de inicio de la secuencia

        while (cont < tam) {
            if (numerosPrimos.primo(comienzo)) {
                vector[cont] = comienzo;
                cont++;

            }
            comienzo++;

        }
        System.out.println("Numeros primos: ");
        for (int i = 0; i <= vector.length; i++) {

            System.out.println(vector[i]);
        }
    }
        //Test fibonacci
 
}


    


    




    

