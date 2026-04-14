import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入一串整数，以 0 结尾，输出它们的和。
        int sum = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            sum += x;
        }

        System.out.println(sum);
        scanner.close();
    }
}
