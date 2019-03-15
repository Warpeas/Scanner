
import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        do {
            System.out.print("Enter the first number:\t");
            int number1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = in.nextInt();
            sum = number1 + number2;
            if (sum != 100)
                System.out.printf("Sum of two numbers is %d\nSum does not equal 100, loop repeats\n", sum);
        } while (sum != 100);
        System.out.printf("Sum equals %d, loop terminates", sum);
    }
}
