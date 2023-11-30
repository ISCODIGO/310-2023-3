public class Node<T> {
    T info;
    Node<T> left;
    Node<T> right;

    public Node(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    public boolean isLeaf() {
        // indicar si no tiene hijos
        return left == null && right == null;
    }
}
