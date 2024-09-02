package beginner_guide.reduce_steps_zero;

import java.util.Scanner;
public class NumberOfSteps {
    public static void main(String[] args) {
        int n = fetchInput();
        System.out.println("Number of steps to reduce "+ numberOfSteps(n));
    }

    public static int fetchInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        return in.nextInt();
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while( num > 0) {
            if(num % 2 == 0) {
                num = num / 2;
                
            }
            else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}
