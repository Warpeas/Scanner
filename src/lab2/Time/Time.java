package lab2.Time;
import java.util.Scanner;

public class Time {
    public static void main(String []args){
        String name;
        int s1,s2,h,m,m1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        s1 = scanner.nextInt();

        h = s1/3600;
        m1 = s1%3600;
        m = m1/60;
        s2 = m1%60;


        System.out.printf("The equivalent time is %d hours %d minutes %d seconds.",h,m,s2);
    }
}
