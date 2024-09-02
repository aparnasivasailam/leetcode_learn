package beginner_guide.running_sum_1D_array;

import java.util.*;
import java.util.Scanner;

public class RunningSum1DArray {
    public static int[] runningSum1(int[] nums) {
        int[] runningSumResult = new int[nums.length];
        runningSumResult[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            runningSumResult[i] += runningSumResult[i-1] + nums[i];
        }
        return runningSumResult;
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        
        int[] nums = fetchInputs();
        runningSum(nums);
        System.out.println(Arrays.toString(nums));


    }

    public static int[] fetchInputs() {
        System.out.println("Please enter how many numbers you want to do running sum: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        System.out.println("Enter the numbers of the array:");
        int[] nums = new int[len];
        for(int i = 0; i< len; i++) {
            nums[i] = in.nextInt();
        }
        return nums;
    }
}
