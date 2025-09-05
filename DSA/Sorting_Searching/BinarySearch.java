public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 7, 9};
        int key = 7;
        int result = binarySearch(numbers, key);
        System.out.println(result);
    }
}
