public class App {
    public static void main(String[] args) throws Exception {
        // UC10: implementing ordered list using linkedlist
        OrderedList<Integer> list = new OrderedList<>();
        list.add(56);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.add(70);
        System.out.println(list);
    }
}