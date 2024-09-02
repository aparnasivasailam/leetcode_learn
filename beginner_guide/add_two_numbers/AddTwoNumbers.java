package beginner_guide.add_two_numbers;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        fetchInputAndPerformAddition();
    }

    public static int callAddTwoNumbers(int x, int y) {
        return x + y;
    }

    public static void fetchInputAndPerformAddition() {
        System.out.println("Please enter the numbers: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int result = callAddTwoNumbers(x, y);
        System.out.println("Sum of the numbers: " + result);
    }
}
