public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // UC4: method to add new node at given index in linkedlist
    public void insertAt(int index, T data) {
        // check if index is valid
        if (index < 0 || index > this.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Node<T> node = new Node<>(data);
        if (index == 0) {
            this.addFirst(data);
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    // UC3: method to add new node at last of linkedlist
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

    // UC2: method to add new node at head of linkedlist
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

    // method to get size of linkedlist
    public int size() {
        Node<T> node = head;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
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