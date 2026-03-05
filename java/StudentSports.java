import java.util.Scanner;
class Student {
    int roll;
    int academicscore;

    void getStudent(int r, int a) {
        roll = r;
        academicscore = a;
    }
}
interface Sports {
    int sportscore = 50;
}
class Results extends Student implements Sports {
    void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Academic Score: " + academicscore);
        System.out.println("Sports Score: " + sportscore);
        System.out.println("Total Score: " + (academicscore + sportscore));
    }
}
public class StudentSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Results r = new Results();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Academic Score: ");
        int academicscore = sc.nextInt();
        r.getStudent(roll, academicscore);
        System.out.println("\nResult Details:");
        r.display();

        sc.close();
    }
}
