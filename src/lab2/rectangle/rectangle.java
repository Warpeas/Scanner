package lab2.rectangle;

import java.util.Scanner;

public class rectangle {
    public static void main(String[]args){
        float w,h,s,c;//set weight as w and height as h, s as area, c as perimeter
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the width of the rectangle");
        w = input.nextFloat();
        System.out.printf("Enter the height of the rectangle");
        h = input.nextInt();

        s = w*h;
        c = 2*(w+h);

        System.out.printf("The area is %.2f.\nThe perimeter is %.2f",s,c);

    }
}
