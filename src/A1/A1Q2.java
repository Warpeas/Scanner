
public class A1Q2 {
    public static void main(String[] args) {
        float rmb = Float.parseFloat(args[0]);
        if (rmb - 50 <= 0)
            System.out.println("0.00");
        else
            System.out.printf("%.2f\n", (rmb - 50) * 1.17);
    }
}
