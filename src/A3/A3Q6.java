

import java.util.Scanner;

public class A3Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        minPathSum(grid);
//        int path = minPathSum(grid);
//        System.out.println(path);
    }
    
    private static void minPathSum(int[][] grid) {
//        for (int i = 1; i < m; i++) {
//            grid[i][0] += grid[i - 1][0];
//        }
//        for (int j = 1; j < n; j++) {
//            grid[0][j] += grid[0][j - 1];
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
//            }
//        }
//        return grid[m - 1][n - 1];
        for (int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        System.out.println(grid[grid.length - 1][grid[grid.length - 1].length-1]);
    }
}