package A3;

import java.util.Scanner;

public class A3Q5 {
    private static int count = 1;
    
    public static int[][] input() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] island = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                island[i][j] = in.nextInt();
            }
        }
        return island;
    }
    
    private static int[] find1(int[][] island) {
        int[] area = new int[island.length * island[0].length];
        int k = 0;
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                if (island[i][j] == 1) {
                    island[i][j] = 0;
                    area[k] = scan(island, i, j);
                    k++;
                    count = 1;
                }
            }
        }
        return area;
    }
    
    private static int scan(int[][] island, int i, int j) {
//        if (j + 1 < island[i].length || i + 1 < island.length) {
        if (j + 1 < island[i].length) {
            if (island[i][j + 1] == 1) {
                island[i][j + 1] = 0;
                count++;
                scan(island, i, j + 1);
            }
        }
        if (j > 0) {
            if (island[i][j - 1] == 1) {
                island[i][j - 1] = 0;
                count++;
                scan(island, i, j - 1);
            }
        }
        if (i + 1 < island.length) {
            if (island[i + 1][j] == 1) {
                island[i + 1][j] = 0;
                count++;
                scan(island, i + 1, j);
            }
//            }
        }
        if (i > 0) {
            if (island[i - 1][j] == 1) {
                island[i - 1][j] = 0;
                count++;
                scan(island, i - 1, j);
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int max = 0;
        int[][] island = input();
        int[] area = find1(island);
        for (int i = 0; i < area.length; i++) {
            max = Math.max(area[i], max);
        }
        System.out.println(max);
    }
}
