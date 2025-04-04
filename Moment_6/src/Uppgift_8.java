import java.util.Scanner;

public class Uppgift_8 {
    public static double range(double maxValue, double minValue) {
        return maxValue - minValue;
    }

    public static int min(int numbers[]) {
        int min = numbers[0];

        for (int y = 1; y < numbers.length; y++) {
            if (numbers[y] < min) {
                min = numbers[y];
            }
        }
        return min;
    }

    public static int max(int numbers[]) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hur många tal vill du mata in? ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Mata in:");
        for (int i = 0; i < n; i++) {
            System.out.print("Tal[" + (i + 1) + "] : ");
            array[i] = input.nextInt();
        }

        input.close();

        double minValue = min(array);
        double maxValue = max(array);
        double rangeValue = range(maxValue, minValue);

        System.out.println("Variationsbredden är: " + rangeValue);
    }
}
