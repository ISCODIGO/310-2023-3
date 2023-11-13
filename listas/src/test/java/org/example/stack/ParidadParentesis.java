package org.example.stack;

import org.example.list.LList;

public class ParidadParentesis {
    // (3 + 2) + (2 + 3))
    //


    public static boolean hayParidad(String palabra) {
        Stack<Character> pila = new LList<>();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (caracter == '(') {
                pila.push(caracter);
            }
            else if (caracter == ')') {
                if (pila.isEmpty())
                    return false;
                pila.pop();
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String palabra = "((2 + 3) / (4 + 5)) * ((1 + 2))";

        System.out.println(hayParidad(palabra));
    }
}
