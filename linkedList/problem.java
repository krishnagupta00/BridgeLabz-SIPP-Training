import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] temperature = new int[7][24];
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
	for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                temperature[day][hour] = scanner.nextInt();
                sum += temperature[day][hour];
                if (temperature[day][hour] < min) {
                    min = temperature[day][hour];
                }
                if (temperature[day][hour] > max) {
                    max = temperature[day][hour];
                }
            }
        } double average = sum / (7 * 24);
	 System.out.printf("Average Temperature: " + average);
        System.out.println("Minimum Temperature: " + min);
        System.out.println("Maximum Temperature: " + max);
    }
}
