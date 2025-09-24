package praktikum52;

public class Toy extends Goods implements Taxable{
    private int minimumAge;

    // constructor
    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    // getter dan setter
    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    // method dari class Goods yang di override oleh class Toy
    @Override
    public void display() {
        System.out.println("toy: " + getDescription() + " price: " + getPrice() + " minimum age to play: " + getMinimumAge());
    }
    
    // method dari interface taxable yang di override oleh class Toy
    @Override
    public double calculateTax() {
        return taxRate * price;
    }
}
