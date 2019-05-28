package Lab8;

public class Circle {
    
        private double radius;
        private double x;
        private double y;
        
        public double area() {
            return radius * radius * Math.PI;
        }
        
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
        
        public void position() {
            System.out.printf("Position of the cricle is (%.1f,%.1f)\n", x, y);
        }
        
        public double getRadius() {
            return radius;
        }
        
        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            }
        }
        
        public double getX() {
            return x;
        }
        
        public void setX(double x) {
            this.x = x;
        }
        
        public double getY() {
            return y;
        }
        
        public void setY(double y) {
            this.y = y;
        }
    
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        
        c1.setRadius(5);
        System.out.println(c1.getRadius());
        System.out.printf("The area of c1 is %.2f\n", c1.area());
        System.out.printf("The perimeter of c1 is %.2f\n", c1.perimeter());
        c1.position();
    }
}
