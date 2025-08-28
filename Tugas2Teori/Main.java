
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Food> foods = new ArrayList<Food>();
            Food food1 = new Food("Nasi Goreng", 1000, 1);
            Food food2 = new Food("Kwetiau", 5000, 3);
            foods.add(food1);
            foods.add(food2);
            Integer t = 1;
            Integer total = 0;
            System.out.println("-------PUJASERA POLBAN-------\n");
            System.out.println("-------Menu Tersedia-------\n");
            for (int i = 0; i < foods.size(); i++) {
                String foodName = foods.get(i).getName();
                System.out.println(i + ": " + foodName);
            }
            while (t > 0) {
                System.out.println("Pilih Menu: (cantumkan nomornya)");
                Integer ord = scanner.nextInt();
                System.out.println("Beli Berapa?: (cantumkan nomornya)");
                Integer buyT = scanner.nextInt();
                Integer stockLeft = foods.get(ord).getStock();
                if (stockLeft >= buyT) {
                    total += foods.get(ord).getPrice() * buyT;
                    foods.get(ord).buy(buyT);
                } else {
                    System.out.println("Stok tidak mencukupi");
                }
                System.out.println("Total Sementara: " + total);
                System.out.println("Beli lagi? (0 jika tidak, 1 jika iya)");
                Integer confirm = scanner.nextInt();
                System.out.println("\n");
                if (confirm == 1) {
                    t = 1;
                } else {
                    t = 0;
                }
            }
            
            
            System.out.println("Total: " + total);
            scanner.close();
        }
    
    }