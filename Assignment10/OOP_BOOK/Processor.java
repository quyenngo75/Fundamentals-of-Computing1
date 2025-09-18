package Assignment10.OOP_BOOK;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();

        System.out.print("Enter the number of books: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.print("Enter type (1 = TextBook, 2 = ReferenceBook): ");
            int type = Integer.parseInt(sc.nextLine());

            System.out.print("Enter book ID: ");
            String id = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter base price: ");
            double basePrice = Double.parseDouble(sc.nextLine());

            if (type == 1) {
                System.out.print("Enter subject: ");
                String subject = sc.nextLine();
                TextBook tb = new TextBook(id, title, basePrice, subject);
                bookList.addBook(tb);
            } else if (type == 2) {
                System.out.print("Enter publisher: ");
                String publisher = sc.nextLine();
                ReferenceBook rb = new ReferenceBook(id, title, basePrice, publisher);
                bookList.addBook(rb);
            } else {
                System.out.println("Invalid type! Skipping...");
            }
        }

        // Display all books
        System.out.println("\n===== BOOK LIST =====");
        bookList.displayAllBooks();

        // Find the most expensive book
        System.out.println("\n===== MOST EXPENSIVE BOOK =====");
        Book expensive = bookList.findMostExpensiveBook();
        if (expensive != null) {
            expensive.displayDetails();
            System.out.println("Price: " + expensive.calculatePrice());
        }

        // Search by ID
        System.out.print("\nEnter book ID to search: ");
        String searchId = sc.nextLine();
        Book searchBook = bookList.findBookById(searchId);
        if (searchBook != null) {
            searchBook.displayDetails();
        } else {
            System.out.println("Book not found!");
        }

        // Delete by ID
        System.out.print("\nEnter book ID to delete: ");
        String deleteId = sc.nextLine();
        boolean deleted = bookList.deleteBookById(deleteId);
        System.out.println("Delete result: " + deleted);

        // Show list after deletion
        System.out.println("\n===== BOOK LIST AFTER DELETION =====");
        bookList.displayAllBooks();

        // Count remaining books
        System.out.println("\nTotal number of books: " + bookList.countBooks());
    }
}
