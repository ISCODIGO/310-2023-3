public class Funciones {
    private static int cantidad = 0;
    private static String mensaje = "";
    public static void recursionInfinita() {
        cantidad++;
        System.out.println("Inicia" + cantidad);
        //if (cantidad < 100) {
            recursionInfinita();
        //}
        System.out.println("Termina " + cantidad);
    }

    public static int sumar(int n) {
        // sumar(n) = 1 + 2 + 3 + 4 + 5 + ... + n
        // sumar(n) = n + (n - 1) + (n - 2) + ... + 3 + 2 + 1
        // sumar(1) = 1
        // sumar(2) = 2 + 1 = 2 + S(2-1)
        // sumar(3) = 3 + 2 + 1 = 3 + S(3-1)
        // sumar(6) = 6 + 5 + 4 + 3 + 2 + 1 = 6 + S(5)
        // sumar(n) = n + S(n-1) = n + (n-1) + S(n-2)

        /*

        | s(1) | -> 1
        | s(2) | -> 2 + 1
        | s(3) | -> 3 + 3
        | s(4) | -> 4 + 6






         */

        if (n == 1) return 1;

        return n + sumar(n - 1);
    }

    public static void main(String[] args) {
        //recursionInfinita();
        System.out.println(sumar(4));
    }
}
