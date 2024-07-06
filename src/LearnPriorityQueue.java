import java.util.PriorityQueue;
import java.util.*;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(20);
        pq.offer(20);
        pq.offer(20);

        System.out.println(pq);
    }

}
