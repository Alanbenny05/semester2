import java.util.Scanner;
public class SearchElement {
    public
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter " + size + " elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the element to search: ");
            int element = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (arr[i] == element) {
                    System.out.println("Element found at position: " + (i+1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Element not found in the array.");
            }
            sc.close();
        }
}
