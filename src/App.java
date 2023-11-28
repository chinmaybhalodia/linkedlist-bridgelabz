public class App {
    public static void main(String[] args) throws Exception {
        // UC2: creating linkedlist and adding nodes
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);

        // UC5: deleting the first element of linkedlist
        list.deleteFirst();
        System.out.println(list);
    }
}
