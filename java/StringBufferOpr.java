import java.util.Scanner;

public class StringBufferOpr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        sb.reverse();
        String result = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase string: " + result);

        System.out.print("Enter another string to append: ");
        String str2 = sc.nextLine();

        sb.append(str2);
        System.out.println("After appending: " + sb);

        sc.close();
    }
}
