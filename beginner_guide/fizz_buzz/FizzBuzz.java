package beginner_guide.fizz_buzz;

import java.util.*;
public class FizzBuzz {
    public static int FIZZ_FACTOR = 3;
    public static int BUZZ_FACTOR = 5;

    public static void main(String[] args) {
        int n = fetchInput();
        List<String> result = getFizzBuzzList(n);
        System.out.println(result.toString());
    }

    public static int fetchInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print: ");
        return in.nextInt();
    }

    public static List<String> getFizzBuzzList(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            String item = "";
            if(i % FIZZ_FACTOR == 0) {
                item += "Fizz";
            }
            if(i % BUZZ_FACTOR == 0) {
                item += "Buzz";
            }
            if(item.length() == 0) {
                item += "" + i;
            }
            list.add(item);
        }
        return list;
    }
}
