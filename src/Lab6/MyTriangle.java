package Lab6;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        double a = 0, b, c, area, perimeter;
        while (a != -1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please input three numbers for a,b,c:");
            a = in.nextDouble();
            if (a == -1)
                break;
            b = in.nextDouble();
            c = in.nextFloat();
            boolean bl = isValid(a, b, c);
            if (bl)
                area = area(a, b, c);
            else {
                System.out.println("The input is invalid.");
                continue;
            }
            System.out.printf("The area is %.3f\n", area);
            perimeter = perimeter(a, b, c);
            System.out.printf("The perimeter is %.3f\n", perimeter);
        }
        System.out.print("Bye~");
    }
    
    public static double area(double a, double b, double c) {
        double semi_c = 0.5 * (a + b + c);
        return Math.sqrt(semi_c * (semi_c - a) * (semi_c - b) * (semi_c - c));
    }
    
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public static double area(double bottom, double height){
        return bottom*height/2 ;
    }
    public static double area(double a, double b, int angleOfAandB){
        return 0.5 * a * b * Math.sin(angleOfAandB);
    }
    public static boolean isValid(double a, double b, double c) {
        double max = Math.max(a, b);
        double Max = Math.max(max, c);
        if (2 * Max >= a + b + c) {
            return false;
        } else
            return true;
    }
}
