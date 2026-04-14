import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        // 输入 n 个整数，统计去重后的个数。
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println("unique count=" + set.size());

        // 查询 k 个数字是否出现过。
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            System.out.println(set.contains(x) ? "YES" : "NO");
        }

        scanner.close();
    }
}
