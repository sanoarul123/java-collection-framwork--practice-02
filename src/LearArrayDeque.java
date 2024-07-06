import java.util.*;
import java.util.ArrayDeque;

public class LearArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> adb = new ArrayDeque<>();

        adb.offer(32);
        adb.offer(32);
        adb.offer(32);
        adb.offer(32);

        System.out.println(adb);

        System.out.println(adb.peek());
        System.out.println(adb.peekFirst());
        System.out.println(adb.peekLast());

        System.out.println(adb.poll());
        System.out.println("poll()" + adb);

        System.out.println(adb.pollFirst());
        System.out.println("poll()" + adb);

        System.out.println(adb.pollLast());
        System.out.println("poll()" + adb);

    }
}
