import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入 n，然后输入 n 个整数到 List。
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // 常见 List 操作示例。
        System.out.println("size=" + numbers.size());
        if (!numbers.isEmpty()) {
            System.out.println("first=" + numbers.get(0));
            System.out.println("last=" + numbers.get(numbers.size() - 1));
        }

        // 排序与反转。
        Collections.sort(numbers);
        System.out.println("sorted=" + numbers);
        Collections.reverse(numbers);
        System.out.println("reversed=" + numbers);

        // 删除一个元素（若存在）。
        if (!numbers.isEmpty()) {
            numbers.remove(0);
        }
        System.out.println("after remove=" + numbers);

        scanner.close();
    }
}
