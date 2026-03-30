import java.util.LinkedList;

public class ClearLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original list: " + list);

        list.clear();

        System.out.println("List after clearing: " + list);
    }
}
