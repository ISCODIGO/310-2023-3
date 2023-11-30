package ejercicios;

public class Ejercicio1 {
    public int largest(int[] numbers, int index) {
        if (index == 0)
            return numbers[0];
        return Math.max(numbers[index], largest(numbers, index-1));
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int result = ejercicio1.largest(new int[]{200, 14, 8}, 2);
        System.out.println(result);
    }
}
