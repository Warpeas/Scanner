package sustech.cs102a.lab10;

import java.util.Scanner;

public class Lab10E1 {
    public static void main(String[] args) {
        System.out.print("Your budget: ");
        Scanner in = new Scanner(System.in);
        int budget = in.nextInt();
        if (budget<5588)
            System.out.println("You do have sufficient money");
        else
        for (int i = 0; i < PhoneModel.values().length; i++) {
            if (PhoneModel.values()[i].getPrice()<budget){
                System.out.printf("%-10s price: %d\n",PhoneModel.values()[i],PhoneModel.values()[i].getPrice());
            }
        }
    }
}
