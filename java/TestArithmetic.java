import arithmetic.*;
public class TestArithmetic {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        Operation add = new Addition();
        Operation subtract = new Subtraction();
        Operation multiply = new Multiplication();
        Operation divide = new Division();
        
        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + subtract.calculate(a, b));
        System.out.println("Multiplication: " + multiply.calculate(a, b));
        System.out.println("Division: " + divide.calculate(a, b));
    }
    
}
