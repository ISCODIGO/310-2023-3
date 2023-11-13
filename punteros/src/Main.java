// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Link L1 = new Link("A");
        Link L2 = new Link("B");
        Link L3 = new Link("X");
        Link L4 = new Link("Y");
        Link L5 = new Link("Z");
        Link L6 = new Link("F");

        // append
        L1.setNext(L2);
        L2.setNext(L3);
        L3.setNext(L4);
        L4.setNext(L5);

        // insert
        // L3.setNext(L6);  // L3 -> L6
        // L6.setNext(L4);  // L6 -> L4

        // insert (mejor)
        L6.setNext(L3.getNext());  // L6 -> L4
        L3.setNext(L6);  // L3 -> L6

        // remove
        L3.setNext(L4);
        


        /*for(Link puntero = L1; puntero != null; puntero = puntero.getNext()) {
            if (puntero.getData().equals("X")) {
                puntero.setData("H");
                break;
            }
        }*/

        for(Link puntero = L1; puntero != null; puntero = puntero.getNext()) {
            System.out.println(puntero.getData());
        }

    }
}

/*

Stack                  Heap
L1=200                 [A, 300] 200
L2=300                 [C, null] 300


 L1 -> L2 -> L3 -> L4 -> L5 -> null
        |
        |
        |
    puntero

               _________
              |         |
 L1 -> L2 -> L3         L4 -> L5 -> null


 */