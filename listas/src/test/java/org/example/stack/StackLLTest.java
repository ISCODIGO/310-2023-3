package org.example.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StackLLTest {
    StackLL<Integer> pila;

    @BeforeEach
    public void setUp() {
        pila = new StackLL<>();
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

}