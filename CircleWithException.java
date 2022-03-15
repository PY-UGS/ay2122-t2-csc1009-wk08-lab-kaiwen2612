import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public CircleWithException(double r) {
        this.radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() throws IllegalArgumentException {
        if (this.radius < 0 || this.radius == 0) {
            throw new IllegalArgumentException();
        }
        return this.radius;
    }

    public double getArea() throws Exception {
        double area = Math.PI * Math.pow(this.radius, 2);
        if (area > 1000) {
            throw new Exception();
        }
        return area;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public static void main (String[] args) throws Exception {
        System.out.print("Enter a radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        CircleWithException cwe = new CircleWithException(radius);
        System.out.println(cwe.getRadius());
        System.out.println(cwe.getArea());
        sc.close();
    }

}
