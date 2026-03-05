import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }

    public void perimeter() {
        double p = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle = " + p);
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }

    public void perimeter() {
        double p = 2 * (l + b);
        System.out.println("Perimeter of Rectangle = " + p);
    }
}

public class MenuDrivenAreaPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rec = new Rectangle(l, b);
                    rec.area();
                    rec.perimeter();
                    break;

                case 3:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}