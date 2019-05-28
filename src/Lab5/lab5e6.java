package Lab5;

import java.util.Scanner;

public class lab5e6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array1 = new int[num];
        int sum = 0, count = 0, AddUp;
        float average;
        for (int i = 0; i < num-1; i++) {
            int ni=in.nextInt();
            array1[i] = ni;
            sum += ni;
        }
        long current1 = System.currentTimeMillis();
        average = (float) sum / num;
        for (int i = 0, n = num - 1; i < n; i++) {
            AddUp = array1[i] + array1[n];
            if (AddUp / 2 > average)
                count++;
            else
                n--;
        }
        long current2 = System.currentTimeMillis();
        System.out.printf("Average=%f\nCount=%d\n",average,count);
        System.out.printf("your program using %.3f second", (current2 - current1) / 1000.0d);
    }
}
