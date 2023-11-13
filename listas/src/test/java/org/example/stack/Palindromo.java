package org.example.stack;

public class Palindromo {
    // balab

    public static boolean esPalindromo(String palabra) {
        Stack<Character> pila = new ArrayStack<>(palabra.length());

        // insertar las letras en pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        // comprobar que la cadena original es igual que su reverso
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != pila.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra = "eeeeeeeeeeeeeeeeeeeeee";
        System.out.printf("La palabra %s esPalindromo = %b", palabra, esPalindromo(palabra));
    }
}
