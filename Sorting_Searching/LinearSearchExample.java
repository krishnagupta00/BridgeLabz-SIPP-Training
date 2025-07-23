public class LinearSearchExample {
    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 9, 4};
        int key = 9;
        int result = linearSearch(numbers, key);
        System.out.println(result);
    }
}
