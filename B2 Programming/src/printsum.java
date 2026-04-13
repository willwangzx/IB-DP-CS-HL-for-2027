import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        // 创建 Scanner 读取用户输入。
        Scanner scanner = new Scanner(System.in);

        // 读取整数并累加；当读到 0 时结束。
        int sum = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println(sum);
        scanner.close();
    }
}
