package lab3;

import java.util.Scanner;

public class lab3e5 {
    public static void main(String[] args) {
        double sum = 0, last_sum = -4, accelerator;
        int counter = 0, n = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the precision\t");
        double precision = input.nextFloat();
        input.close();

        while (Math.abs(sum - last_sum) >= precision) {
            last_sum = sum;
            accelerator = 4 / (float) n;
            if ((counter & 1) != 1) {
                sum = sum + accelerator;
            } else {
                sum = sum - accelerator;
            }
            n += 2;
            counter += 1;

        }

        System.out.printf("%f", sum);
    }
}