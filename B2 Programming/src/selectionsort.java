import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 读取数组元素。
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 选择排序：每一轮将最小值放到当前位置。
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // 逐行输出排序结果。
        for (int value : arr) {
            System.out.println(value);
        }

        scanner.close();
    }
}
