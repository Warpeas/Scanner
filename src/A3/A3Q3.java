package A3;


import java.util.Scanner;

public class A3Q3 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
        spiral();
    }
    
    private static void spiral() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        int amount = m * n;
        int count = 1;
        int circle = 0;
        while (count <= amount) {
            int row = circle;
            int column = n - 1 - circle;
            while (column >= circle) {
                matrix[row][column] = count;
                count++;
                column--;
            }
            if (m==1)
                break;
            column++;
            row++;
            while (row < m - circle) {
                matrix[row][column] = count;
                count++;
                row++;
            }
            row--;
            column++;
            while (column < n - circle) {
                matrix[row][column] = count;
                count++;
                column++;
            }
            if (count > amount)
                break;
            column--;
            row--;
            while (row > circle) {
                matrix[row][column] = count;
                count++;
                row--;
            }
            circle++;
        }
        print(matrix);
    }
    
    private static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}