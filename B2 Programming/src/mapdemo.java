import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> score = new HashMap<>();

        // 输入 m 组 (name, value)。
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            String name = scanner.next();
            int value = scanner.nextInt();
            score.put(name, value);
        }

        // 查询 q 次姓名对应的分数。
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String name = scanner.next();
            if (score.containsKey(name)) {
                System.out.println(score.get(name));
            } else {
                System.out.println("Not Found");
            }
        }

        scanner.close();
    }
}
