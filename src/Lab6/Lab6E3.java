package Lab6;

import java.util.Scanner;

public class Lab6E3 {
    public static void main(String[] args) {
        int sNum, cNum;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the number of subjects: ");
        cNum = in.nextInt();
        System.out.printf("Please input the number of students: ");
        sNum = in.nextInt();
        int[][] GradeBook = new int[sNum][cNum];
        for (int j = 0; j < cNum;j++ ) {
            for (int i = 0; i < sNum; i++) {
                GradeBook[i][j] = in.nextInt();
            }
        }
        System.out.println("\tCourse1\tCourse2\tCourse3\tAverage");
        for (int j = 1; j < cNum-1;j++) {
            float sum = 0;
            System.out.printf("Student%d\t", j);
            for (int i = 0; i < sNum; i++) {
                System.out.printf("%d\t",GradeBook[j-1][i]);
                sum += GradeBook[j-1][i];
            }
            System.out.printf("%.2f",sum/3);
        }
    }
}
