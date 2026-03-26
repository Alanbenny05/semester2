import graphics.*;
public class TestGraphics {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 3);
        Figure triangle = new Triangle(4, 6);
        Figure square = new Square(4);
        Figure circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
