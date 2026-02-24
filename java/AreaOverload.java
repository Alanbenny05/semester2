import java.util.Scanner;

class Area {

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }
}
public class AreaOverload {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculateArea(r));

        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculateArea(l, b));

        System.out.print("\nEnter base of triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter height of triangle: ");
        float height = sc.nextFloat();
        System.out.println("Area of Triangle: " + obj.calculateArea(base, height));

        sc.close();
    }
}
