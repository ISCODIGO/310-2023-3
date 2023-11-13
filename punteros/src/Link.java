public class Link {
    private Object data;
    private Link next;

    public Link(Object data, Link next) {
        this.data = data;
        this.next = next;
    }

    public Link(Object data) {
        this.data = data;
        this.next = null;
    }



    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
