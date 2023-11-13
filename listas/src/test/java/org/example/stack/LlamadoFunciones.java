package org.example.stack;

public class LlamadoFunciones {
    public static void a() {
        System.out.println("Esperando b");
        b();
        System.out.println("Finaliza a");
    }

    public static void b() {
        System.out.println("Esperando c");
        c();
        System.out.println("Finaliza b");
    }

    public static void c() {
        System.out.println("Finaliza c");
    }

    public static void main(String[] args) {
        System.out.println("Esperando a");
        a();
    }
}
