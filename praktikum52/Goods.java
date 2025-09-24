package praktikum52;

public abstract class Goods {
    protected String description;
    protected double price;

    // constructor
    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }


    // abstract method yang dapat di override oleh class turunannya
    public abstract void display();


    // getter dan setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
