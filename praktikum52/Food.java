package praktikum52;

public class Food extends Goods{
    private int calories;

    // constructor
    public Food(String description, double price, int calories) {
        super(description, price);
        this.calories = calories;
    }

    // getter dan setter
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    // method dari class Goods yang di override oleh class Food
    @Override
    public void display() {
        System.out.println("food: " + getDescription() + " price: " + getPrice() + " calories: " + getCalories());
    }
}
