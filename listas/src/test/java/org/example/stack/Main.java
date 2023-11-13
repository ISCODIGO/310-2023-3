package org.example.stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack1 = new ArrayStack<>(10);

        System.out.println("Push...");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            stack1.push(i);
        }

        System.out.println("Pop...");
        while(!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
