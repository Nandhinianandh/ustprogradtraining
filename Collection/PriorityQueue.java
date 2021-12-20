
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue {

    public static void main(String[] args) {

        //   PriorityQueue<Integer> pq = new PriorityQueue();//minheap
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());//maxheap
        pq.add(10);
        pq.add(2);
        pq.add(30);
        pq.add(3);
        pq.add(13);
        pq.add(-2);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
