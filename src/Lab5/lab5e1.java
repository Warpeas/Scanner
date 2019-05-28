package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class lab5e1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of myList1:");
        int length = in.nextInt();
        double[] myList1 = new double[length];
        System.out.println("");
        System.out.printf("Enter %d values:", length);
        double number = in.nextDouble();
        for (int i = 0; i <= length-1; i++) {
            myList1[i] = number;
        }
        System.out.println();
        double last = myList1[length - 1];
        for (int i = 0; i <= length - 2; i++) {
            myList1[ i] = myList1[i+1];
        }
        myList1[0] = last;
        double[] myList2 = myList1;
        System.out.print("myList1:");
        for (int i = 0; i <= length; i++) {
            System.out.printf("%.1f", myList1[i]);
        }
        System.out.println("");
        for (int i = 0; i <= length; i++) {
            System.out.printf("%.1f", myList2[i]);
        }
    }
}
