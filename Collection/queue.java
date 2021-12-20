import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class queue {//deque->double ended queue

    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);

        ArrayDeque<Integer> deque = new ArrayDeque();
        deque.add(10);
        deque.addFirst(20);
        deque.add(30);
        deque.addLast(40);
        deque.addAll(arraylist);
        System.out.println("list");
        deque.forEach(num -> System.out.println(num));
        System.out.println("peek ->"+deque.peek());
        System.out.println("peeklast->"+deque.peekLast());
        System.out.println("deleting->"+deque.poll());
        //deque.clear();
        System.out.println(deque);
        // System.out.println("removing->"+deque.remove(30));
        deque.removeAll(arraylist);
        System.out.println("list");
        deque.forEach(num -> System.out.println(num));
    }
}
