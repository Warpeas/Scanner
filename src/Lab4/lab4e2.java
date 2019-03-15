package Lab4;

import java.util.Scanner;

public class lab4e2 {
    public static void main(String[] args) {
        float gpa, final_gpa = 0;
        int score, credit = 0, total_credit = 0;
        Scanner input = new Scanner(System.in);
        credit = input.nextInt();
        while (credit != -1) {

            score = input.nextInt();
            switch (score / 10) {
                case 6:
                    gpa = 1.0f;
                    break;
                case 7:
                    gpa = 2.0f;
                    break;
                case 8:
                    gpa = 3.0f;
                    break;
                case 9:
                case 10:
                    gpa = 4.0f;
                    break;
                default:
                    gpa = 0f;
            }
            final_gpa += gpa*credit;
            total_credit += credit;
            credit = input.nextInt();
        }
        final_gpa = final_gpa / total_credit;
        System.out.printf("Your final gpa is %.1f\n%d", final_gpa, total_credit);
    }
}