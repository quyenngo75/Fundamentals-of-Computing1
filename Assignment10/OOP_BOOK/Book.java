
package Assignment10.OOP_BOOK;

public abstract class Book implements IBook{
    protected String id;
    protected String title;
    protected double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    @Override
    public void addBook(Book book) {
        
        throw new UnsupportedOperationException("Not supported here. Use BookList.");
    }

    @Override
    public boolean updateBookById(String id) {
        return false;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Base Price: " + basePrice);
    }

    @Override
    public abstract double calculatePrice();

    public String getId() { return id; }
    public String getTitle() { return title; }
    public double getBasePrice() { return basePrice; }
}
