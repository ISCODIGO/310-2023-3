package org.example.queue;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayQueue<Integer> cola = new ArrayQueue<>(5);
            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);
            cola.dequeue();
            cola.dequeue();
            cola.enqueue(40);
            cola.enqueue(50);
            cola.enqueue(60);
            cola.enqueue(70);
            System.out.println(cola.getFront());
            cola.print();
        } catch (NoSuchFieldException e) {
            System.err.println("Hubo un error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.err.println("Hubo un error: " + e2.getMessage());
        }
    }
}
