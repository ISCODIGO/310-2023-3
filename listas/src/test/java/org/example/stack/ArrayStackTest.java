package org.example.stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.SpinnerUI;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    ArrayStack<Integer> pila;

    @BeforeEach
    public void setUp() {
        pila = new ArrayStack<>(5);
    }

    @Test
    public void testPush() {
        pila.push(10);
        pila.push(20);

        assertEquals(2, pila.length());
        assertEquals(20, pila.topValue());
    }

    @Test
    public void testPop() {
        pila.push(10);
        pila.push(20);
        pila.push(30);

        assertEquals(30, pila.pop());
        assertEquals(2, pila.length());

        assertEquals(20, pila.pop());
        assertEquals(1, pila.length());
    }

    @Test
    public void testStackUnderflow() {
        assertThrowsExactly(NoSuchElementException.class, () -> {
            pila.pop();
        });
    }

    @Test
    public void testStackOverflow() {
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {
            pila.push(60);
        });
    }


}