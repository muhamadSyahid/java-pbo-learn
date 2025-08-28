public class Food{
    private String name;
    private Integer price;
    private Integer stock;
    public Food(String name, Integer price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPrice() {
        return this.price;
    }

    public Integer getStock() {
        return this.stock;
    }
    public void buy(Integer t) {
        this.stock -= t;
    }
}
