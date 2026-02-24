import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of string: " + str.length());

        if (str.length() >= 4) {
            System.out.println("Character at second position: " + str.charAt(1));
            System.out.println("Character at fourth position: " + str.charAt(3));
        } else {
            System.out.println("String is too short to get 2nd and 4th characters.");
        }

        if (str.length() >= 3) {
            System.out.println("Substring from index 2: " + str.substring(2));
        }

        if (str.length() >= 5) {
            System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));
        }

        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        System.out.println("After concatenation: " + str.concat(str2));

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        System.out.println("After replacement: " + str.replace(oldChar, newChar));

        sc.nextLine(); 

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();

        if (str.startsWith(prefix)) {
            System.out.println("String starts with \"" + prefix + "\"");
        } else {
            System.out.println("String does not start with \"" + prefix + "\"");
        }

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}
