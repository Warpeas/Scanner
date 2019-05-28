package Lab9;

import java.util.Random;

public class Lab9E1 {
    public static void main(String[] args) {
        double minArea = 0;
        double maxDistanceToOrigin = 0;
        int mina = 0, maxd = 0;
        Random random = new Random();
        int N = random.nextInt(5) + 5;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            Circle circle = new Circle(1);
            double radius = random.nextInt(2) + 1;
            circle.setRadius(radius);
            double x = random.nextInt(3) + 2;
            circle.setX(x);
            double y = random.nextInt(3) + 2;
            circle.setY(y);
            circles[i] = circle;
//            System.out.println(circles[i]);
            if (circles[i].area() == Math.min(circles[i].area(), minArea))
                mina = i;
            minArea = Math.min(circles[i].area(), minArea);
            if (circles[i].distanceToOrigin() == Math.max(circles[i].distanceToOrigin(), maxDistanceToOrigin))
                maxd = i;
            maxDistanceToOrigin = Math.max(circles[i].distanceToOrigin(), maxDistanceToOrigin);
        }
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Circle #%d: radius = %.2f, x = %.2f, y = %.2f\n", i + 1, circles[i].getRadius(), circles[i].getX(), circles[i].getY());
        }
        System.out.printf("Circle #%d is the smallest circle, area = %.2f\nCircle #%d is the farthest circle, distance to origin =%.2f", mina, minArea, maxd, maxDistanceToOrigin);
    }
    
}
