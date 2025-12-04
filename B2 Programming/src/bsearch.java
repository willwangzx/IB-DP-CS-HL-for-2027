public class bsearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = ((high + low) / 2);

        while (high >= low) {
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

    }
}
