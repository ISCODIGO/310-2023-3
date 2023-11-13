package org.example.list;

import java.util.NoSuchElementException;
import org.example.stack.Stack;

// Linked list implementation
public class LList<E> implements List<E>, Stack<E> {
    private Link<E> head;      // Pointer to list header
    private Link<E> tail;      // Pointer to last element
    private Link<E> curr;      // Access to current element
    private int listSize;      // Size of list

    // Constructors
    public LList(int size) {      // Constructor -- Ignore size
        this();
    }

    public LList() {
        clear();
    }

    @Override
    public boolean push(E it) {
        moveToStart();
        return insert(it);
    }

    @Override
    public E pop() {
        moveToStart();
        return remove();
    }

    @Override
    public E topValue() {
        moveToStart();
        return getValue();
    }

    // Remove all elements
    public void clear() {
        curr = tail = head = null;
        listSize = 0;
    }

    private boolean setFirstLink(E it) {
        head = tail = curr = new Link<>(it, null);
        listSize = 1;
        return true;
    }

    // Insert "it" at current position
    public boolean insert(E it) {
        if (isEmpty()) return setFirstLink(it);

        /*
        El siguiente codigo hace lo siguiente:
        - Crea una copia (valor y enlace) del current.
        - Current.next apunta a esa copia.
        - Hacen un intercambio de posiciones (realmente lo que hace es colocar el nuevo valor donde esta current).
         */
        curr.setNext(new Link<E>(curr.element(), curr.next()));
        curr.setElement(it);
        if (tail == curr) {
            tail = curr.next();  // New tail
        }
        listSize++;
        return true;
    }

    // Append "it" to list
    public boolean append(E it) {
        if (isEmpty()) {
            return setFirstLink(it);
        }

        tail.setNext(new Link<E>(it, null));
        tail = tail.next();
        listSize++;
        return true;
    }

    // Remove and return current element
    public E remove() throws NoSuchElementException {
        if (curr == null || isEmpty()) {
            throw new NoSuchElementException("No hay elemento actual");
        }

        E it = curr.element();

        // opcion 1: remover el primer nodo O(1)
        if (curr == head) {
            head = head.next();
            curr = head;
        }
        // opcion 2: remover un nodo interior o el ultimo O(n)
        else {
            var oldCurr = curr;

            prev();  // O(n)
            curr.setNext(curr.next().next());

            if (oldCurr == tail) {
                curr = tail;
            }
        }

        listSize--;

        return it;
    }

    public void moveToStart() {
        curr = head; // Set curr at list start
    }

    public void moveToEnd() {
        curr = tail; // Set curr at list end
    }

    // Move curr one step left; no change if now at front
    public void prev() {
        if (head == curr) {
            return; // No previous element
        }

        var temp = head;
        // March down list until we find the previous element
        while (temp.next() != curr) {
            temp = temp.next();
        }
        curr = temp;
    }

    // Move curr one step right; no change if now at end
    public void next() {
        if (curr != tail) {
            curr = curr.next();
        }
    }

    public int length() {
        return listSize;
    } // Return list length


    // Return the position of the current element
    public int currPos() {
        Link<E> temp = head.next();
        int i;
        for (i = 0; curr != temp; i++) {
            temp = temp.next();
        }
        return i;
    }

    // Move down list to "pos" position
    public boolean moveToPos(int pos) {
        if ((pos < 0) || (pos > listSize)) {
            return false;
        }
        curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next();
        }
        return true;
    }

    // Return true if current position is at end of the list
    public boolean isAtEnd() {
        return curr == tail;
    }

    // Return current element value. Note that null gets returned if curr is at the tail
    public E getValue() throws NoSuchElementException {
        if (curr == null) // No current element
        {
            throw new NoSuchElementException("getvalue() in LList has current of " + curr + " and size of "
                    + listSize + " that is not a a valid element");
        }
        return curr.element();
    }

    //Tell if the list is empty or not
    public boolean isEmpty() {
        return head == null || tail == null;  // Using OR to check something is failed
    }
}