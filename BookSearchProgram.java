import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSearchProgram {
    public static void main(String[] args) {

        TestNS testNS = new TestNS();
        testNS.id= 103 ;

        TestS.TestSS one = new TestS.TestSS();
        one.id = 100;
        one.fun1();

        TestS.TestSS two = new TestS.TestSS();
        two.id = 200;
        two.fun1();




        // Create a list of books
        List<Book> books = new ArrayList<>();

        Book book1 = new Book(1, "ABC", "Vinesh", 100);
        Book book2 = new Book(2, "XYZ", "Nish", 50);
        Book book3 = new Book(3, "QWE", "Vinesh", 56);
        Book book4 = new Book(4, "POI", "Nish", 110);
        Book book5 = new Book(4, "ZUI", "Nish", 10);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a book title to search for: ");
        String searchTerm = scanner.nextLine();


        boolean found = false;
        for (Book book : books) {
            System.out.println("Hi " + book.getName());
            if (book.getName().toLowerCase().equals(searchTerm.toLowerCase())) {
                book.ShowDetails();
                found = true;
                break;
            }
        }


        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
