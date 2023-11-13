package org.example.list;

import org.example.list.LList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LListTest {
    private LList<Integer> lista;

    @BeforeEach
    void setup() {
        lista = new LList<>();
    }

    @Test
    void testLastLink() {
        lista.append(10);
        assertEquals(1, lista.length());
        assertEquals(10, lista.getValue());

        lista.moveToEnd();
        assertEquals(10, lista.getValue());

        lista.append(20);
        lista.moveToEnd();
        assertEquals(20, lista.getValue());

    }

    @Test
    void testInsert() {
        lista.append(10);
        lista.append(20);
        // < |10, 20>

        lista.insert(30);
        // < |30, 10, 20 >
        assertEquals(3, lista.length());
        assertEquals(30, lista.getValue());

        lista.moveToPos(1);
        // < 30, |10, 20 >
        assertEquals(10, lista.getValue());

        lista.insert(40);
        // < 30, |40, 10, 20 >
        assertEquals(4, lista.length());
        assertEquals(40, lista.getValue());

        lista.prev();
        assertEquals(30, lista.getValue());

        lista.next();
        lista.next();
        assertEquals(10, lista.getValue());
    }

    @Test
    public void testRemoveFirst() {
        lista.append(10);
        lista.append(20);
        lista.append(30);
        // < |10, 20, 30>

        lista.remove();
        // < |20, 30 >

        assertEquals(2, lista.length());
        assertEquals(20, lista.getValue());
        lista.next();
        assertEquals(30, lista.getValue());
    }

    @Test
    public void testRemoveLast() {
        lista.append(10);
        lista.append(20);
        lista.append(30);
        // < |10, 20, 30>

        lista.moveToEnd();
        // < 10, 20, |30>
        lista.remove();
        // < 10, 20 >

        assertEquals(2, lista.length());
        assertEquals(20, lista.getValue());
    }

    @Test
    public void testRemoveMiddle() {
        lista.append(10);
        lista.append(20);
        lista.append(30);

        lista.next();
        // < 10, |20, 30>
        lista.remove();
        // < 10, |30 >

        assertEquals(2, lista.length());
        assertEquals(30, lista.getValue());
        lista.prev();
        assertEquals(10, lista.getValue());
    }

}