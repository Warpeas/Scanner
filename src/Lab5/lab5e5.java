package Lab5;

import java.util.Scanner;

public class lab5e5 {
    public static void main(String[] args) {
        System.out.print("How many numbers you will input:");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arrays = new int[length];

        for (int i = 0; i < arrays.length; i++) {
            int element = in.nextInt();
            arrays[i] = element;
        }
        System.out.println("");
        for (int j = 0; j < arrays.length-1; j++) {
            for (int i = 0; i < arrays.length-1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                }
            }
        }
        for (int i = 0;i<arrays.length;i++){
            System.out.printf("%4d",arrays[i]);
        }
    }
}
