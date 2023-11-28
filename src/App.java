public class App {
    public static void main(String[] args) throws Exception {
        // UC2: creating linkedlist and adding nodes
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);

        // UC8: insert node 40 after node 30
        list.insertAfterNode(30, 40);
        System.out.println(list);

        // UC9: delete node 40
        list.deleteNode(40);
        System.out.println(list);
    }
}
