public class App {
    public static void main(String[] args) throws Exception {
        // UC2: creating linkedlist and adding nodes
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(70);

        // UC4: inserting 30 between 56 and 70 add index 1
        list.insertAt(1, 30);
        System.out.println(list);
    }
}
