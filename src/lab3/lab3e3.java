package lab3;

public class lab3e3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 80; i++) {
            int j = i / 9 + 1, k = i % 9 + 1;
            if (j >= k) {
                System.out.printf("%2d *%2d = %d\t", j, k, j * k);
            }
            if (i / 9 + 1 == i % 9 + 1) {
                System.out.print("\n");
            }
        }
        int a = 1, b = 1;
        while (b <= 9) {
            while (a <= b) {
                System.out.printf("%2d *%2d = %d\t", a, b, a * b);
                a += 1;
            }
            System.out.print("\n");
            b += 1;
            a = 1;
        }
    }
}