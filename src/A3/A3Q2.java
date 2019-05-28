package A3;

import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 3)
            System.out.println("0");
        else {
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = in.nextInt();
            }
            Stored_Water(height);
//        int max = getmax(height);
        }
    }
    
    //    private static int getmax (int height[]){
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            if (height[i]>max)
//                max = height[i];
//        }
//        return max;
//    }
    private static void Stored_Water(int[] height) {
        int water = 0;
        int largestLeft, largestRight;
        int left, right;
        for (int i = 1; i < height.length - 1; i++) {
            left = i-1;
            right = i+1;
            largestLeft = 0;
            largestRight = 0;
            while (left >= 0) {
                largestLeft = Math.max(height[left], largestLeft);
                left--;
            }
            while (right < height.length) {
                largestRight = Math.max(height[right], largestRight);
                right++;
            }
            if (height[i]>=largestLeft||height[i]>=largestRight){
            
            }
            else if (largestLeft > largestRight) {
                water += largestRight - height[i];
            }
            else if (largestLeft < largestRight) {
                water += largestLeft - height[i];
            }
        }
        System.out.print(water);
    }
}

