import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dequedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        // 输入操作数 t。
        // 1 x: addFirst, 2 x: addLast
        // 3: pollFirst, 4: pollLast
        // 5: peekFirst, 6: peekLast
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int op = scanner.nextInt();
            if (op == 1) {
                int x = scanner.nextInt();
                deque.addFirst(x);
            } else if (op == 2) {
                int x = scanner.nextInt();
                deque.addLast(x);
            } else if (op == 3) {
                System.out.println(deque.isEmpty() ? "Empty" : deque.pollFirst());
            } else if (op == 4) {
                System.out.println(deque.isEmpty() ? "Empty" : deque.pollLast());
            } else if (op == 5) {
                System.out.println(deque.isEmpty() ? "Empty" : deque.peekFirst());
            } else if (op == 6) {
                System.out.println(deque.isEmpty() ? "Empty" : deque.peekLast());
            }
        }

        scanner.close();
    }
}
