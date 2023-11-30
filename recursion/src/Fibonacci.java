public class Fibonacci {
    public static long recursiones = 0;
    public static long calcular(int n) {
        // caso base
        if (n == 0 || n == 1) {
            recursiones++;
            return n;
        }

        // caso recursivo
        recursiones++;
        return calcular(n - 1) + calcular(n - 2);
    }

    public static long calcular2(int n, long[] memoria) {
        if (memoria == null) {
            memoria = new long[n+1];
            memoria[0] = 0;
            memoria[1] = 1;
        }

        /*
            Si n = 5
            El array seria [0, 1, 0, 0, 0]
        */
        // caso base
        if (n == 0 || memoria[n] > 0) {
            recursiones++;
            return memoria[n];
        }

        recursiones++;
        memoria[n] = calcular2(n-1, memoria) + calcular2(n-2, memoria);
        return memoria[n];
    }

    public static void main(String[] args) {
        int n = 40;
        recursiones = 0;

        long start1 = System.currentTimeMillis();
        long resultado1 = Fibonacci.calcular(n);
        System.out.printf("Fibonacci(%d) = %d", n, resultado1);
        System.out.println("\tRecursiones: " + recursiones);
        long end1 = System.currentTimeMillis();
        System.out.println("\tTiempo: " + (end1-start1));

        recursiones = 0;

        long start2 = System.currentTimeMillis();
        long resultado2 = Fibonacci.calcular2(n, null);
        System.out.printf("Fibonacci(%d) = %d", n, resultado2);
        System.out.println("\tRecursiones: " + recursiones);
        long end2 = System.currentTimeMillis();
        System.out.println("\tTiempo: " + (end2-start2));
    }
}
