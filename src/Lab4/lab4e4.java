package Lab4;

import java.util.Scanner;

public class lab4e4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while (true) {
            num = in.nextInt();
            if (num == 0)
                break;
            else if (num < 0 || num > 9)
                continue;
            else
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("%d*%d=%d\t", j, i, j * i);
                    }
                    System.out.println("");
                }
        }

    }
}
