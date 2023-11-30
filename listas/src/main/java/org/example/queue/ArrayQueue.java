package org.example.queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int front;
    private int end;
    private int size;

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
        this.clear();
    }
    @Override
    public boolean enqueue(E it) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Cola esta llena");
        end = next(end);
        data[end] = it;
        size++;
        return true;
    }

    @Override
    public E dequeue() throws NoSuchFieldException {
        if (isEmpty()) throw new NoSuchFieldException("Cola esta vacia");

        front = next(front);
        E old = data[front];
        size--;
        return old;
    }

    @Override
    public E getFront() throws NoSuchFieldException {
        if (isEmpty()) throw new NoSuchFieldException("Cola vacia");
        return data[front];
    }

    @Override
    public void clear() {
        this.front = 0;
        this.end = -1;
        this.size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    private int next(int pos) {
        return (pos + 1) % data.length;
    }

    public void print() {
        System.out.println("Frente: " + front + " final: " + end);
        System.out.print("Cola: ");
        int aux = front;
        boolean evitarCondicion = false;

        if (front > 0) {
            evitarCondicion = true;
        }

        while (evitarCondicion || aux != next(end)) {
            System.out.print(data[aux] + ", ");
            aux = next(aux);

            if (evitarCondicion) evitarCondicion = false;
        }
        System.out.println("\nArray: " + Arrays.toString(data));
    }
}
