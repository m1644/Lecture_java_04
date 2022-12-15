import java.util.ArrayDeque;
import java.util.Deque;
/**
 * Task_03
 */
public class Task_03 {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);  // [1, 2] 
        deque.removeFirst();
        deque.removeLast();    
        System.out.println(deque);  // []
        deque.offerFirst(1);    // Вставляет указанный элемент в начало deque, если только это не нарушит ограничения емкости.
        deque.offerLast(2);     // Вставляет указанный элемент в конец deque, если только это не нарушит ограничения емкости.
        System.out.println(deque);  // [1, 2]
        System.out.println(deque.pollFirst());  // Извлекает и удаляет первый элемент этого deque или возвращает null, если этот deque пуст.
        System.out.println(deque.pollLast());   // Извлекает и удаляет последний элемент этого deque или возвращает null, если этот deque пуст.
        System.out.println(deque);  // []
        deque.addFirst(16);
        deque.addLast(24);
        System.out.println(deque);   // [16, 24]
        System.out.println(deque.getFirst());   // Извлекает, но не удаляет, первый элемент этого deque. (с исключением)
        System.out.println(deque.getLast());   // Извлекает, но не удаляет, последний элемент этого deque. (с исключением)
        System.out.println(deque.peekFirst());  // Извлекает, но не удаляет, первый элемент этого deque или возвращает null
        System.out.println(deque.peekLast());  // Извлекает, но не удаляет, последний элемент этого deque или возвращает null
    }
}
