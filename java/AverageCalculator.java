import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class AverageCalculator {
 public static double calculateAverage(int[] numbers) throws NegativeNumberException {
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                throw new NegativeNumberException("Negative number found: " + num);
            }
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of elements (N):");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            
            System.out.println("Enter " + n + " positive integers:");
            for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
            double average = calculateAverage(numbers);
            System.out.println("The average is: " + average);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Invalid Input!");
        } finally {
            scanner.close();
        }
    }   
}
