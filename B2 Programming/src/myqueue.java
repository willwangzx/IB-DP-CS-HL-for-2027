import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class myqueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // 输入操作次数 q。
        int q = scanner.nextInt();

        // 约定操作：
        // 1 x -> 入队 x
        // 2   -> 出队并打印；空队列打印 "Empty"
        // 3   -> 打印队首；空队列打印 "Empty"
        for (int i = 0; i < q; i++) {
            int op = scanner.nextInt();
            if (op == 1) {
                int x = scanner.nextInt();
                queue.offer(x);
            } else if (op == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    System.out.println(queue.poll());
                }
            } else if (op == 3) {
                if (queue.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    System.out.println(queue.peek());
                }
            }
        }

        scanner.close();
    }
}
