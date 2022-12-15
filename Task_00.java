import java.util.PriorityQueue;
/**
 * Task_00
 */
public class Task_00 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(12);
        pq.add(1);
        System.out.println(pq); // [1, 3, 12, 123]
        System.out.println(pq.poll());  // 1
        System.out.println(pq.poll());  // 3
        System.out.println(pq.poll());  // 12
        System.out.println(pq.poll());  // 123
        System.out.println(pq.poll());  // null
    }
}
