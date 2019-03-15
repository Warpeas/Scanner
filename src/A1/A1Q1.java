

public class A1Q1 {
    public static void main(String[] args) {
        float radium = Float.parseFloat(args[0]);
        float pi = 3.14f;
        float perimeter = 2 * pi * radium;
        float area = (float)Math.pow(radium, 2) * pi;
        System.out.printf("%.2f\n%.2f\n", perimeter, area);
    }
}
