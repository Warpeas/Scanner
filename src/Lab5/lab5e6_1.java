package Lab5;
import java.util.Scanner;

public class lab5e6_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        
        // Prompt the user to enter how many integers
        System.out.print("Enter how many numbers: ");
        int n=input.nextInt();
        int[] numbers = new int[n]; // Create an array of length ten
        
        System.out.printf("Enter %d numbers: ",n);
        // calculate the average value
        int total=0;
        for (int i = 0; i < n; i++){
            numbers[i] = input.nextInt();
            total+=numbers[i];
        }
        long current1=System.currentTimeMillis();
        double avg=total/(double)n;
        System.out.println("average="+avg);
        avg*=2;
        int count=0;
        
        // using 2-layer-for loop to find the pairs
        // simply search for each possible combination
        // not so fast, but still acceptable
        // time complexity O(n^2)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if ((numbers[i]+numbers[j])>avg){
                    count+=n-j;
                    break;
                }
            }
        }
        System.out.println("The number of these couple is "+ count);
        long current2=System.currentTimeMillis();
        System.out.printf("your program using %.3f second",(current2-current1)/1000.0d);
    }
    
    
}
