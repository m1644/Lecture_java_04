import java.util.Queue;
import java.util.LinkedList;
/**
 * Task_01
 */
public class Task_01 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);  // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue);  // [2, 3, 4]
        queue.offer(2808);
        System.out.println(queue);  // [2, 3, 4, 2808]
        item = queue.remove();
        System.out.println(queue);  // [3, 4, 2808]
        item = queue.remove();
        System.out.println(queue);  // [4, 2808]
        item = queue.poll();
        System.out.println(queue);  // [2808]
    }
}
