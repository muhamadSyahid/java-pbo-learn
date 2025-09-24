package praktikum52;

public class Book extends Goods implements Taxable{
    private String author;

    // constructor
    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    //getter dan setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    // method dari class Goods yang di override oleh class Book
    @Override
    public void display() {
        System.out.println("book: " + getDescription() + " price: " + getPrice() + " author: " + getAuthor());
        
    }
    
    // method dari interface taxable yang di override oleh class Book
    @Override
    public double calculateTax() {
        return taxRate * price;
    }
}
