public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // method to add new node at last of linkedlist
    public void add(T data) {
        Node<T> node = new Node<>(data);
        // if linkedlist is empty
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    // method to add new node at head of linkedlist
    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        // if linkedlist is empty
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    @Override
    public String toString() {
        String listdata = "";
        Node<T> node = head;
        while (node != null) {
            listdata += node.data + " ";
            node = node.next;
        }
        return listdata;
    }
}