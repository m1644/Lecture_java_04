import java.util.LinkedList;
import java.util.Queue;
/**
 * Task_02
 */
public class Task_02 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        System.out.println(queue);  // [1]
        //int item = queue.remove();
        queue.offer(2808);        // Вставляет указанный элемент в очередь
        System.out.println(queue);  // [1, 2808]
        int item = queue.poll();    // Извлекает и удаляет заголовок этой очереди
        System.out.println(queue);  // [2808]
        queue.remove(2808);     // Удаляет элемент в очереди
        System.out.println(queue);  // []
        queue.element();
        queue.peek();
    }
}
