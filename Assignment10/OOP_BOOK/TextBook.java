
package Assignment10.OOP_BOOK;

public class TextBook extends Book {
    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    @Override
    public double calculatePrice() {
       
        return basePrice * 1.1;
    }
}
