import java.util.Scanner;
class Publisher {
    String publishername;
    Publisher(String publishername) {
        this.publishername = publishername;
    }
}
class Book extends Publisher {
    String booktitle;
    String authorname;
    double price;

    Book(String publishername, String booktitle, String authorname, double price) {
        super(publishername);
        this.booktitle = booktitle;
        this.authorname = authorname;
        this.price = price;
    }
}
class Literature extends Book {
    Literature(String publishername, String booktitle, String authorname, double price) {
        super(publishername, booktitle, authorname, price);
    }
    void display() {
        System.out.println("\nCategory: Literature");
        System.out.println("Book Title: " + booktitle);
        System.out.println("Author Name: " + authorname);
        System.out.println("Price: " + price);
        System.out.println("Publisher Name: " + publishername);
        System.out.println("-----------------------------");
    }
}
class Fiction extends Book {
    Fiction(String publishername, String booktitle, String authorname, double price) {
        super(publishername, booktitle, authorname, price);
    }
    void display() {
        System.out.println("\nCategory: Fiction");
        System.out.println("Book Title: " + booktitle);
        System.out.println("Author Name: " + authorname);
        System.out.println("Price: " + price);
        System.out.println("Publisher Name: " + publishername);
        System.out.println("-----------------------------");
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Literature Book Details ");
        System.out.print("\nBook Name: ");
        String lname = sc.nextLine();

        System.out.print("Author Name: ");
        String lauthor = sc.nextLine();

        System.out.print("Price: ");
        double lprice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Publisher Name: ");
        String lpublisher = sc.nextLine();

        Literature l = new Literature(lpublisher, lname, lauthor, lprice);

        System.out.print("\nEnter Fiction Book Details ");
        System.out.print("\nBook Name: ");
        String fname = sc.nextLine();

        System.out.print("Author Name: ");
        String fauthor = sc.nextLine();

        System.out.print("Price: ");
        double fprice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Publisher Name: ");
        String fpublisher = sc.nextLine();

        Fiction f = new Fiction(fpublisher, fname, fauthor, fprice);
        
        System.out.println("\nBook Details:");
        l.display();
        f.display();
    }  
}
       