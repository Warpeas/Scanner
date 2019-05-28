package A3;

import java.util.Arrays;
import java.util.*;

public class A3Q1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        
        while (s != 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] matrix = new int[m][n];
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[0][i] = in.nextInt();
                }
                System.out.println(Arrays.toString(matrix[0]).substring(1, Arrays.toString(matrix[0]).length() - 1));
            } else{
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }
                //System.out.printf("\n");
                GCD(matrix);
            }
            s--;
        }
    }
    
    private static void GCD(int[][] matrix) {
        int i = 1, j = 0;
        while (i < matrix.length && j < matrix[i].length) {
            int gcd = GCD(matrix[i - 1][j], matrix[i][j]);
            while (i != matrix[j].length - 1) {
                i++;
                gcd = GCD(matrix[i][j], gcd);
            }
            System.out.printf("%d ", gcd);
            j++;
            i = 1;
        }
        System.out.printf("\n");
    }
    
    private static int GCD(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
//    private static void GCD(int[][] matrix, int i, int j) {
//        int a = matrix[j][i];
//        int b = matrix[j + 1][i];
//        if (a < b) {
//            int t = a;
//            a = b;
//            b = t;
//        }
//        while (b != 0) {
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        j++;
//        if (j == matrix[j].length - 1) {
//            i++;
//            j = 0;
//        }
//        if (i!=matrix.length) {
//            GCD(matrix, i, j);
//        }
//    }
}
