public class Main {
    public static void main(String[] args) {
        BinaryTree<Character> tree = new BinaryTree<>();
        tree.insert('A', null);
        var nodoB = tree.insert('B', tree.getRoot());
        var nodoC = tree.insert('C', tree.getRoot());
        tree.insert('D', nodoB);
        tree.insert('E', nodoB);
        tree.insert('F', nodoC);

        System.out.println(tree.getRoot().right.info);
        System.out.println(tree.size());
        System.out.println("Rcorrido en preorden...");
        tree.preorden();
        System.out.println("Recorrido en orden...");
        tree.inorden();
        /*

        n1
        |- n2
        |  |- n4
        |
        |- n3

                  n1
                 /  \
                /    \
               n2    n3
              /
             n4




         */
    }
}
