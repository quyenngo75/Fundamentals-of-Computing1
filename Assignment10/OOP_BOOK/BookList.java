
package Assignment10.OOP_BOOK;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                System.out.println("Updated book with id: " + id);
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book b : bookList) {
            b.displayDetails();
            System.out.println("-------------------");
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) return null;
        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }

    public int countBooks() {
        return bookList.size();
    }
}
