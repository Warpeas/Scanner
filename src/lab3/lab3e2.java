package lab3;

import java.util.Scanner;

public class lab3e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gpa = 1,score=input.nextFloat()   ;

        if (score >= 60) {
            System.out.println("You pass the exam.");
        } else
            System.out.println("You failed.");

        if (score >= 0 && score <= 100) {
            if (score <= 100 && score >= 90)
                gpa = 4.0f;
            if (score < 90 && score >= 80)
                gpa = 3.0f;
            if (score < 80 && score >= 70)
                gpa = 2.0f;
            if (score < 70 && score >= 60)
                gpa = 1.0f;
            if (score < 60 && score >= 0)
                gpa = 0;
        } else {
            System.out.println("Invalide grade");
            return;
        }
        System.out.printf("Your score is %.1f, the GPA is %.1f.\n", score, gpa);
    }
}
