import java.util.Scanner;
public class TestLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Authentication auth = new Authentication();

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            auth.checkLogin(username, password);
        } catch (InvalidLoginException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
