package org.example.stack;

import org.example.list.LList;
import org.example.list.List;

public class StackLL<E> implements Stack<E> {
    Stack<E> lista;

    public StackLL() {
        lista = new LList<>();
    }

    @Override
    public boolean push(E it) {
        return lista.push(it);
    }

    @Override
    public E pop() {
        return lista.pop();
    }

    @Override
    public E topValue() {
        return lista.topValue();
    }

    @Override
    public void clear() {
        lista.clear();
    }

    @Override
    public int length() {
        return lista.length();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
