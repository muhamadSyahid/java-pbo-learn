package praktikum52;

public interface Taxable {
    public double taxRate = 0.06;

    // method yang dapat di override oleh class yang mengimplementasi taxable
    public double calculateTax();
}
