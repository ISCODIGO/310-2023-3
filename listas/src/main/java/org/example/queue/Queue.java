package org.example.queue;

public interface Queue<E> {
    public boolean enqueue(E it);

    // Remove and return the element at the top of the stack
    public E dequeue() throws NoSuchFieldException;

    // Return a copy of the top element
    public E getFront() throws NoSuchFieldException;

    // Reinitialize the stack.
    public void clear();


    // Return the number of elements in the stack
    public int length();

    // Tell if the stack is empty or not
    public boolean isEmpty();
}
