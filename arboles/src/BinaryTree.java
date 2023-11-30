public class BinaryTree<T> {
    private Node<T> root;
    private int size;

    public BinaryTree() {
        clear();
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public int size() {
        return size;
    }

    public Node<T> insert(T et, Node<T> n) {
        Node<T> newNode = new Node<>(et);
        size++;

        if (root == null) {
            this.root = newNode;
            return this.root;
        }

        if (n.left == null) {
            n.left = newNode;
        } else if (n.right == null) {
            n.right = newNode;
        }

        return newNode;
    }

    public void preorden() {
        preordenRecursivo(root);
    }

    public void preordenRecursivo(Node<T> n) {
        if (n == null) return;

        // visitar el nodo
        System.out.println(n.info);
        // recorrer en preorden nodo.left
        preordenRecursivo(n.left);
        // recorrer en preorden nodo.right
        preordenRecursivo(n.right);
    }

    public void inorden() {
        inordenRecursivo(root);
    }

    public void inordenRecursivo(Node<T> n) {
        if (n == null) return;

        // recorrer nodo.left
        inordenRecursivo(n.left);
        // visitar el nodo
        System.out.println(n.info);
        // recorrer nodo.right
        inordenRecursivo(n.right);
    }
}
