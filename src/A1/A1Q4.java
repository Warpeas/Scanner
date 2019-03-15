
public class A1Q4 {
    public static void main(String[] args) {
        int upper = Integer.parseInt(args[0]);
        //Wait for user to input upper bound
        int sum = 0 ;
        for (int i = 1; i <= upper; sum += i, i++) {
        }
        System.out.printf("%d\n", sum);
    }
}
