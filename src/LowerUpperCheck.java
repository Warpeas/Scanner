import java.math.BigDecimal;
import java.util.Scanner;

public class LowerUpperCheck {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        String name1 = name.substring(0, 1).toUpperCase() + name.substring(1, name.length() - 1).toLowerCase();
////        if (name.charAt(0)>='A'&&name.charAt(0)<='Z')
////            System.out.println("Upper");
////        else
////            System.out.println("Lower");
////        if (Character.isUpperCase(name.charAt(0)))
////            System.out.println("Upper");
////        else System.out.println("Lower");
//        System.out.println(name + "  " + name1);
//    }
//        double a = 3213.32;
//        System.out.printf("%,.2f",a);
        double loanAmount = 3000000;
        int years = 30;
        double rate = 0.049;
        System.out.printf("%f%n%f%n", rate / 12 * Math.pow(1 + rate / 12, years * 12), Math.pow(1 + rate / 12, years * 12) - 1);
        System.out.printf("%f%n%f%n", loanAmount * (rate / 12 * Math.pow(1 + rate / 12, years * 12)) / (Math.pow(1 + rate / 12, years * 12) - 1),years * 12 * loanAmount * (rate / 12 * Math.pow(1 + rate / 12, years * 12)) / (Math.pow(1 + rate / 12, years * 12) - 1) - loanAmount);
//        System.out.printf("%f", years * 12 * loanAmount * (rate / 12 * Math.pow(1 + rate / 12, years * 12)) / (Math.pow(1 + rate / 12, years * 12) - 1) - loanAmount);
    }
}
