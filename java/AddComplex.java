import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real,
                           this.imaginary + c.imaginary);
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}

public class AddComplex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        double r1 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i1 = sc.nextDouble();

        System.out.println("Enter second complex number:");
        System.out.print("Real part: ");
        double r2 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.print("Sum: ");
        result.display();

        sc.close();
    }
}
