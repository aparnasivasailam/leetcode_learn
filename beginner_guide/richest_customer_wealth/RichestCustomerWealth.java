package beginner_guide.richest_customer_wealth;

import java.util.Scanner;;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] matrix = fetchMatrix();
        System.out.println("Maximum wealth among customers: " + maximumRowValue(matrix));
    }

    public static int[][] fetchMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int customers = in.nextInt();
        System.out.println("Enter how many accounts does each customer have: ");
        int accounts = in.nextInt();
        int[][] matrix = new int[customers][accounts];
        for(int i = 0; i < customers; i++) {
            System.out.println("Enter the wealth of accounts of customer "+(i+1));
            for(int j = 0; j < accounts; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public static int maximumRowValue(int[][] matrix) {
        int maximumRow = 0;
        for(int i = 0; i < matrix.length; i++) {
            int rowValue = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                rowValue += matrix[i][j];
            }
            if(rowValue > maximumRow) {
                maximumRow = rowValue;
            }
        }
        return maximumRow;
    }
}
