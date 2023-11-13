package org.example.stack;

import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
    private E[] data;
    private int size;

    public ArrayStack(int capacity) {
        data = (E[])new Object[capacity];
        clear();
    }

    @Override
    public boolean push(E it) throws ArrayIndexOutOfBoundsException {
        if (data.length == size) {
            throw new ArrayIndexOutOfBoundsException("Stack overflow");
        }
        data[size++] = it;
        return true;
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        E it = data[size - 1];
        size--;
        return it;
    }

    @Override
    public E topValue() {
        return data[size - 1];
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
