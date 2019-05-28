package Lab9;

import java.util.Scanner;

public class Lab9E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Type a string (\"quit\" to finish ):");
            String string = in.nextLine();
            if (string.equals("quit"))
                break;
            int i = 0;
            int j = string.length() - 1;
            int flag = 0;
            while (i <= j) {
                if (string.charAt(i) == string.charAt(j)) {
                    i++;
                    j--;
                } else {
                    flag = 1;
                    System.out.println(string + "is not a palindrome");
                    break;
                }
            }
            if (flag == 0)
                System.out.println(string + " is a palindrome");
        } while (!in.toString().isEmpty());
    }
}
