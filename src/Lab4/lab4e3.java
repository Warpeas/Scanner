package Lab4;

import java.util.Scanner;

public class lab4e3 {
    public static void main(String[] args) {
        int year, month, day = 0;
        String months = "January";
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        month = input.nextInt();
        input.close();
        switch (month) {
            case 1:
                months = "January";
                day = 31;
                break;
            case 2:
                months = "Feburary";
                if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0)
                    day = 29;
                else day = 28;
                break;
            case 3:
                months = "March";
                day = 31;
                break;
            case 4:
                months = "April";
                day = 30;
                break;
            case 5:
                months = "May";
                day = 31;
                break;
            case 6:
                months = "June";
                day = 30;
                break;
            case 7:
                months = "July";
                day = 31;
                break;
            case 8:
                months = "August";
                day = 31;
                break;
            case 9:
                months = "September";
                day = 30;
                break;
            case 10:
                months = "October";
                day = 31;
                break;
            case 11:
                months = "November";
                day = 30;
                break;
            case 12:
                months = "December";
                day = 31;
                break;
            default: {
                System.out.println("You input a wrong month.\n");
            }
        }
        System.out.printf("%s of %d has %d days.", months, year, day);

    }
}