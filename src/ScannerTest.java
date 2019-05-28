import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        String a = "123";
        Scanner in = new Scanner(System.in);
        System.out.println('0');
        String d = in.next();
        System.out.println('1');
        int a = in.nextInt();
        System.out.println('2');
        String b = in.nextLine().replace(" ","");
        System.out.println('3');
    }
}
