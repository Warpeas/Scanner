

import java.util.Scanner;

public class A3Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int T = in.nextInt();
        while (T > 0) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            GetSubSum(matrix, x1, y1, x2, y2);
            T--;
        }
    }
    
    private static void GetSubSum(int[][] matrix, int x1, int y1, int x2, int y2) {
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
