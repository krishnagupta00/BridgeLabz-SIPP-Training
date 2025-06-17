import java.util.Scanner;

public class MinMaxFinder {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //taking input numbers
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
     // function call
        int[] result = findSmallestAndLargest(a, b, c);
//print smallest number or largest number
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
