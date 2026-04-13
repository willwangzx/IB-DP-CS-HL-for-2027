import java.util.Arrays;

/**
 * 简单的数组工具类：提供最大值、最小值和输出功能。
 */
class MyArray {
    private final int[] data;

    MyArray(int[] data) {
        this.data = data;
    }

    /**
     * 返回数组中的最大值；空数组返回 0。
     */
    public int max() {
        if (data.length == 0) {
            return 0;
        }

        int maxValue = data[0];
        for (int value : data) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /**
     * 返回数组中的最小值；空数组返回 0。
     */
    public int min() {
        if (data.length == 0) {
            return 0;
        }

        int minValue = data[0];
        for (int value : data) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    /**
     * 打印数组内容（空格分隔）。
     */
    public void print() {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class arraye {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 5, 2, 9};
        MyArray helper = new MyArray(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Max: " + helper.max());
        System.out.println("Min: " + helper.min());
        helper.print();
    }
}
