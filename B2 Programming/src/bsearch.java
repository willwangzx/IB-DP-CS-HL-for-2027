public class bsearch {
    /**
     * 二分查找：在有序数组中查找 key。
     *
     * @param arr 升序数组
     * @param key 目标值
     * @return 找到返回下标，找不到返回 -1
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // 使用这种写法避免 low + high 溢出。
            int mid = low + (high - low) / 2;

            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 10, 13, 20};
        int key = 10;
        int index = binarySearch(arr, key);
        System.out.println("Index: " + index);
    }
}
