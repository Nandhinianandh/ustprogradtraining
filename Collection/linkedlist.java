import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("apple");
        linkedlist.add("banana");
        linkedlist.add("pomegranate");
        linkedlist.add("orange");
        System.out.println(linkedlist);
        linkedlist.remove(3);
        System.out.println(linkedlist);
        linkedlist.forEach(fruits -> System.out.println(fruits));
        System.out.println(linkedlist.lastIndexOf("banana"));
        linkedlist.addLast("mango");
        System.out.println(linkedlist);
        linkedlist.set(1,"ripebanana");
        System.out.println(linkedlist);
    }
}
