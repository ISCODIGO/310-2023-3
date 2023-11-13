package org.example.stack;

public interface Stack<E> { // Stack class ADT
    // Push "it" onto the top of the stack
    public boolean push(E it);

    // Remove and return the element at the top of the stack
    public E pop();

    // Return a copy of the top element
    public E topValue();

    // Reinitialize the stack.
    public void clear();


    // Return the number of elements in the stack
    public int length();

    // Tell if the stack is empty or not
    public boolean isEmpty();
}